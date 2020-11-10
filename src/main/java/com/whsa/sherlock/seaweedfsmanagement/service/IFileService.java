package com.whsa.sherlock.seaweedfsmanagement.service;

import org.springframework.stereotype.Service;

import java.io.File;

@Service
public interface IFileService {

    void uploadByFile(File file);
}
