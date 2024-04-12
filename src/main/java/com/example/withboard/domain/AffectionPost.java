package com.example.withboard.domain;

import jakarta.persistence.*;
import lombok.Getter;

import static jakarta.persistence.FetchType.LAZY;

@Entity
@Getter
public class AffectionPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="affection_post_id")
    private Long affectionPostId;

    // 외래키 - 회원 id
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "user_id")
    private User user;


    // 외래키 - 게시글 id
    @OneToOne(fetch = LAZY)
    @JoinColumn(name = "post_id")
    private Post post;
}
