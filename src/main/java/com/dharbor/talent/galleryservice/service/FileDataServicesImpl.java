package com.dharbor.talent.galleryservice.service;

import com.dharbor.talent.galleryservice.domain.File;
import com.dharbor.talent.galleryservice.domain.FileData;
import com.dharbor.talent.galleryservice.repository.FileDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FileDataServicesImpl implements IFileDataService{
    @Autowired
    private FileDataRepository repository;
    @Override
    public FileData save(File file, byte[] bytes) {
        FileData fileData = new FileData();
        fileData.setFile(file);
        fileData.setValue(bytes);

        return repository.save(fileData);
    }

    @Override
    public FileData findById(String fileId) {
        return repository.findById(fileId)
                .orElseThrow(()-> new RuntimeException("Unable to location a File for fileId "+ fileId));
    }
}
