package com.whsa.sherlock.seaweedfsmanagement.controller;

import com.whsa.sherlock.seaweedfsmanagement.service.IFileService;
import com.whsa.sherlock.seaweedfsmanagement.service.serviceimpl.FileService;
import com.whsa.sherlock.seaweedfsmanagement.util.HttpRequestSeaweed;
import com.whsa.sherlock.seaweedfsmanagement.util.MultipartFileToFile;
import com.whsa.sherlock.seaweedfsmanagement.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
public class FileController {
    @Autowired
    IFileService fileService;

    @PostMapping(value = "/uploadFile",consumes = "application/json",produces = "application/json")
    public ResultVO upload(){


        return null;
    }

    @PostMapping(value = "/downloadFile",consumes = "application/json",produces = "application/json")
    public ResultVO download(){

        return null;
    }

    @PostMapping(value = "/queryFile",consumes = "application/json",produces = "application/json")
    public ResultVO query(){
        return null;
    }

    @PostMapping(value = "/deleteFile",consumes = "application/json",produces = "application/json")
    public ResultVO delete(){
        return null;
    }

    @PostMapping(value = "/uploadFileByFile",consumes = "multipart/form-data",produces = "application/json")
    public ResultVO uploadByFile(@RequestParam("file") MultipartFile multipartFile) throws IOException {
        File file = MultipartFileToFile.multipartFileToFile(multipartFile);
        fileService.uploadByFile(file);
        HttpRequestSeaweed.uploadImage(file);
        MultipartFileToFile.deleteTempFile(file);

        return null;
    }

    @PostMapping(value = "/downloadFileByFile",consumes = "application/json",produces = "application/json")
    public ResultVO downloadByFile(){
        return null;
    }



}
