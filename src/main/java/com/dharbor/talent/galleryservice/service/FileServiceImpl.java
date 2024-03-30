package com.dharbor.talent.galleryservice.service;

import com.dharbor.talent.galleryservice.domain.File;
import com.dharbor.talent.galleryservice.repository.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class FileServiceImpl implements IFileService{
    private FileRepository repository;
    @Autowired
    private IFileDataService fileDataService;

    public FileServiceImpl(FileRepository repository) {
        this.repository = repository;
    }

    @Override
    public File save(MultipartFile file) {
        File instance = new File();

        instance.setName(file.getName());
        instance.setMimetype(file.getContentType());
        instance.setSize(file.getSize());
        repository.save(instance);


        try {
            fileDataService.save(instance, file.getBytes());
        } catch (IOException e) {
            throw new RuntimeException("Its not posible save a fileData");
        }
        return instance;
    }

    @Override
    public File findById(String fileId) {
        return repository.findById(fileId)
                .orElseThrow(()-> new RuntimeException("Unable to locate a file for dileId "+fileId));
    }
}
