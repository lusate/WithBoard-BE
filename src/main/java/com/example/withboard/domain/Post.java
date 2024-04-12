package com.example.withboard.domain;

import jakarta.persistence.*;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_id")
    private Long postId;


    private String title;

    private String content;

    @CreatedDate
    private LocalDateTime write_At;


    @OneToOne(mappedBy = "post", cascade = CascadeType.ALL)
    private AffectionPost affectionPost;

    @OneToOne(mappedBy = "post", cascade = CascadeType.ALL)
    private TogetherPost togetherPost;

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL)
    private List<Review> reviewList = new ArrayList<>();

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL)
    private List<Likes> likeList = new ArrayList<>();

    // 이미지
    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL)
    private List<Image> imageList = new ArrayList<>();



    public void modifyPost(String title, String content){
        this.title=title;
        this.content=content;
    }
}
