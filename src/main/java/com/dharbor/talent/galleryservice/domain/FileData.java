package com.dharbor.talent.galleryservice.domain;

import lombok.Getter;
import lombok.Setter;
import org.bson.codecs.pojo.annotations.BsonId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
@Getter
@Setter
@Document(collation = "filedata")
public class FileData {
    @Id
    private String id;
    private byte[] value;
    @DBRef
    private  File file;
}
