package com.example.withboard.domain;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static jakarta.persistence.FetchType.LAZY;

@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "review_id")
    private Long reviewId;

    @CreatedDate // 엔티티가 생성된 날짜를 나타내는 필드를 선언
    private LocalDateTime write_at;

    @Column(nullable = false)
    private String content;

    // 외래키 리뷰 작성한 User_id
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "user_id")
    private User user;


    // 외래키 게시글 id
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "post_id")
    private Post post;

}
