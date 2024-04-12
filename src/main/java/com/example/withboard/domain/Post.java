package com.example.withboard.domain;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId;

    private String user_id;

    private String title;

    private String content;

    @CreatedDate
    private LocalDateTime write_At;


    @OneToMany(mappedBy = "affectionPost", cascade = CascadeType.ALL)
    private List<AffectionPost> affectionPostList = new ArrayList<>();

    @OneToMany(mappedBy = "review", cascade = CascadeType.ALL)
    private List<Review> reviewList = new ArrayList<>();

    @OneToOne(mappedBy = "review", cascade = CascadeType.ALL)
    private TogetherPost togetherPost;
}
