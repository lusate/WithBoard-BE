package com.example.withboard.domain;

import jakarta.persistence.*;

import static jakarta.persistence.FetchType.LAZY;

@Entity
public class Likes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "like_id")
    private Long likeId;

    private boolean likeStatus; // like 상태 값

    // 외래키 게시글 id
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "post_id")
    private Post post;


    // 외래키 좋아요 누른 User_id
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "user_id")
    private User user;
}
