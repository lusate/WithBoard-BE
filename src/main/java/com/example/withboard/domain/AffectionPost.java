package com.example.withboard.domain;

import jakarta.persistence.*;

import static jakarta.persistence.FetchType.LAZY;

@Entity
public class AffectionPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long affectionPostId;

    // 외래키 - 회원 id
    @ManyToOne(fetch = LAZY)
    @JoinColumn
    private User user;


    // 외래키 - 게시글 id
    @OneToOne
    @JoinColumn
    private Post post;
}
