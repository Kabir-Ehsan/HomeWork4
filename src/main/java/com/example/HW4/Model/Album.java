package com.example.HW4.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Albums")
public class Album {

    @Id
    private String id;
    private String name;
    private String email;
    private String coverPhotoUrl;
    public String createdBy;
    public Date dateCreated;

}

