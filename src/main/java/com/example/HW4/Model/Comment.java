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
@Document(collection = "comments")

public class Comment {
    @Id
    private String id;
    private String photoId;
    private String message;
    public String createdBy;
    public Date dateCreated;
}
