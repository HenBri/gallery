package com.dharbor.talent.galleryservice.usecase;

import com.dharbor.talent.galleryservice.domain.File;
import com.dharbor.talent.galleryservice.service.IFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class CreateFileUseCase {
    @Autowired
    private IFileService fileService;

    public File execute(MultipartFile file){
        return  fileService.save(file);
    }
}
