package com.example.withboard.domain;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

import static jakarta.persistence.FetchType.LAZY;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String user_id;

    private String title;

    private String content;

    @CreatedDate
    private LocalDateTime write_At;


    // 외래키 뽐내기 작성한 user_id
    @ManyToOne(fetch = LAZY)

}
