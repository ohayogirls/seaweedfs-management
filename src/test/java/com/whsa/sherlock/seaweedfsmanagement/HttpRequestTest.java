package com.whsa.sherlock.seaweedfsmanagement;

import com.whsa.sherlock.seaweedfsmanagement.util.HttpRequestSeaweed;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;


public class HttpRequestTest {
    @Test
    public void test1() throws IOException {
        HttpRequestSeaweed httpRequestSeaweed = new HttpRequestSeaweed();
        File file = new File("C:\\Users\\sherlock\\Desktop\\pic\\dota2.jpg");
        httpRequestSeaweed.uploadImage("sherlock",file);
    }
}
