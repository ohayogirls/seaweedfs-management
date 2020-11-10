package com.whsa.sherlock.seaweedfsmanagement.util;

import org.springframework.web.multipart.MultipartFile;

import java.io.*;

public class MultipartFileToFile {

    public static File multipartFileToFile(MultipartFile file) throws IOException {

        File toFile = null;
        if(file.equals("")||file.getSize()<=0) {
            file = null;
        }else{
            InputStream ins =null;
            ins = file.getInputStream();
            toFile = new File(file.getOriginalFilename());
            inputStreamToFile(ins,toFile);
            ins.close();
        }
        return toFile;
    }

    private static void inputStreamToFile(InputStream ins,File toFile) {
        try{
            OutputStream os = new FileOutputStream(toFile);
            int bytesRead = 0;
            byte[] buffer = new byte[8192];
            while((bytesRead=ins.read(buffer,0,8192))!=-1){
                os.write(buffer,0,bytesRead);
            }
            os.close();
            ins.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void deleteTempFile(File file){
        if(file!=null){
            File del = new File(file.toURI());
            del.delete();
        }
    }
}
