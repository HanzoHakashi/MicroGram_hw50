package com.example.homework_50.entity;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;
@Data
public class Likes {
   private  User likedUsers;
   private List<Post> likedPost;
   private LocalDate dateOfLike;
}
