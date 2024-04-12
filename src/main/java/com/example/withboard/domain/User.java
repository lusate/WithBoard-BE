package com.example.withboard.domain;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String userImage;

    @OneToMany(mappedBy = "TogetherPost", cascade = CascadeType.ALL)
    List<Review> reviewList = new ArrayList<>();

    @OneToMany(mappedBy = "like", cascade = CascadeType.ALL)
    List<Likes> likesList = new ArrayList<>();

    @OneToMany(mappedBy = "affectionPost", cascade = CascadeType.ALL)
    List<AffectionPost> affectionPostList = new ArrayList<>();

    @OneToMany(mappedBy = "togetherPost", cascade = CascadeType.ALL)
    List<TogetherPost> togetherPostList = new ArrayList<>();
}
