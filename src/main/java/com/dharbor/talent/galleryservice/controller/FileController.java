package com.dharbor.talent.galleryservice.controller;

import com.dharbor.talent.galleryservice.domain.File;
import com.dharbor.talent.galleryservice.usecase.CreateFileUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/gallery")
public class FileController {

    @Autowired
    private CreateFileUseCase createFileUseCase;

    @PostMapping
    public File uploadFile(@RequestPart MultipartFile file){
        return createFileUseCase.execute(file);

    }
}
