package com.dharbor.talent.galleryservice.repository;

import com.dharbor.talent.galleryservice.domain.File;
import com.dharbor.talent.galleryservice.domain.FileData;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileDataRepository extends MongoRepository<FileData, String> {
}
