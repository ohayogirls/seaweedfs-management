package com.whsa.sherlock.seaweedfsmanagement.util;

import okhttp3.*;
import okio.BufferedSink;

import java.io.File;
import java.io.IOException;

public class HttpRequestSeaweed {
    //1.创建对应的MediaType
    private static final MediaType MEDIA_TYPE_PNG = MediaType.Companion.parse("image/png");
    private final OkHttpClient client = new OkHttpClient();

    public HttpRequestSeaweed(){};
    public void uploadImage(String userName, File file) throws  IOException {

        //2.创建RequestBody
        RequestBody fileBody = RequestBody.Companion.create(file,MEDIA_TYPE_PNG);

        //3.构建MultipartBody
        RequestBody requestBody = new MultipartBody.Builder()
                .setType(MultipartBody.FORM)
                .addFormDataPart("file", "testImage.png", fileBody)
                .addFormDataPart("userName", userName)
                .build();

        //4.构建请求
        Request request = new Request.Builder()
                .url("http://localhost:9333/submit")
                .post(requestBody)
                .build();

        //5.发送请求
        Response response = client.newCall(request).execute();

        System.out.println(response.body().string());

    }
}
