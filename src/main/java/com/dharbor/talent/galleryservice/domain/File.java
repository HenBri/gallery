package com.dharbor.talent.galleryservice.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Setter
@Getter
@Document(collation = "file")
public class File {
    @Id
    private String id;
    @Field("mimetype")
    private String mimetype;
    @Field("name")
    private String name;
    @Field("size")
    private Long size;
}
