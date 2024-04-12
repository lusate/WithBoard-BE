package com.example.withboard.domain;

import jakarta.persistence.*;

@Entity
public class Likes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long like_id;

    private boolean likeStatus;

    // 외래키 게시글 id

    // 외래키 좋아요 누른 User_id

}
