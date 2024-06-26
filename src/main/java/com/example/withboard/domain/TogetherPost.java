package com.example.withboard.domain;

import jakarta.persistence.*;
import lombok.Getter;

import static jakarta.persistence.FetchType.LAZY;

@Entity
@Getter
public class TogetherPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "together_post_id")
    private Long togetherPostId;

    @Column(nullable = false)
    private Integer capacity; // 제한 인원

    // 외래키
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    // 외래키
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "spot_location_id")
    private SpotLocation spotLocation;

    // 외래키
    @OneToOne(fetch = LAZY)
    @JoinColumn(name = "post_id")
    private Post post;

}
