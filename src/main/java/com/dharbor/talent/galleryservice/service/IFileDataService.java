package com.dharbor.talent.galleryservice.service;

import com.dharbor.talent.galleryservice.domain.File;
import com.dharbor.talent.galleryservice.domain.FileData;

public interface IFileDataService {
    FileData save(File file, byte[] bytes);
    FileData findById(String fileId);
}
