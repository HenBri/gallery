package com.dharbor.talent.galleryservice.service;

import com.dharbor.talent.galleryservice.domain.File;
import org.springframework.web.multipart.MultipartFile;

public interface IFileService {
    File save(MultipartFile file);
    File findById(String fileId);
}
