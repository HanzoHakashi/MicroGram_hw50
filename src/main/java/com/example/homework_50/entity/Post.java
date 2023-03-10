package com.example.homework_50.entity;

import lombok.Data;

import java.time.LocalDate;
@Data
public class Post {
    private String image;
    private String description;
    private LocalDate postDate;
}
