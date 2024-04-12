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


    @OneToOne(mappedBy = "affectionPost", cascade = CascadeType.ALL)
    private AffectionPost affectionPost;

    @OneToMany(mappedBy = "review", cascade = CascadeType.ALL)
    private List<Review> reviewList = new ArrayList<>();

    @OneToOne(mappedBy = "togetherPost", cascade = CascadeType.ALL)
    private TogetherPost togetherPost;

    @OneToMany(mappedBy = "likes", cascade = CascadeType.ALL)
    private List<Likes> likeList = new ArrayList<>();

    // 이미지
    @OneToMany(mappedBy = "image", cascade = CascadeType.ALL)
    private List<Image> imageList = new ArrayList<>();
}
