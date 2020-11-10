package com.whsa.sherlock.seaweedfsmanagement.service.serviceimpl;

import com.whsa.sherlock.seaweedfsmanagement.repository.FileRepository;
import com.whsa.sherlock.seaweedfsmanagement.service.IFileService;
import com.whsa.sherlock.seaweedfsmanagement.util.HttpRequestSeaweed;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class FileService implements IFileService {

    @Autowired
    private FileRepository fileRepository;

    @SneakyThrows
    @Override
    public void uploadByFile(File file) {
        HttpRequestSeaweed.uploadImage(file);

    }
}
