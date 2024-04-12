package com.example.withboard.domain;

import jakarta.persistence.*;

import static jakarta.persistence.FetchType.LAZY;

@Entity
public class TogetherPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long togetherPostId;

    @Column(nullable = false)
    private Integer capacity;

    // 외래키
    @ManyToOne(fetch = LAZY)
    @JoinColumn
    private User user;

    // 외래키
    @ManyToOne(fetch = LAZY)
    @JoinColumn
    private SpotLocation spotLocation;

    // 외래키
    @OneToOne(fetch = LAZY)
    @JoinColumn
    private Post post;

}
