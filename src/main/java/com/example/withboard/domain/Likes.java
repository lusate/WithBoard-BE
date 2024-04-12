package com.example.withboard.domain;

import jakarta.persistence.*;

import static jakarta.persistence.FetchType.LAZY;

@Entity
public class Likes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long likeId;

    private boolean likeStatus;

    // 외래키 게시글 id
    @ManyToOne(fetch = LAZY)
    @JoinColumn
    private Post post;


    // 외래키 좋아요 누른 User_id
    @ManyToOne(fetch = LAZY)
    @JoinColumn
    private User user;
}
