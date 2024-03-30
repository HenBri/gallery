package com.dharbor.talent.galleryservice.repository;

import com.dharbor.talent.galleryservice.domain.File;
import com.dharbor.talent.galleryservice.domain.FileData;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FileRepository extends MongoRepository<File, String> {
    Optional<File> findByFileId(String fileId);


}
