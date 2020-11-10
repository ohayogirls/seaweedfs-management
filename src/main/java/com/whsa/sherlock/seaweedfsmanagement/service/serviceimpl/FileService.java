package com.whsa.sherlock.seaweedfsmanagement.service.serviceimpl;

import com.whsa.sherlock.seaweedfsmanagement.repository.FileRepository;
import com.whsa.sherlock.seaweedfsmanagement.service.IFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FileService implements IFileService {

    @Autowired
    private FileRepository fileRepository;




}
