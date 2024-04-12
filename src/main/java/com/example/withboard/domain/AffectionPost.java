package com.example.withboard.domain;


import com.example.withboard.repository.AffectionRepository;
import com.example.withboard.repository.PostRepository;
import com.example.withboard.dto.AffectionPostRequestUpdateDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import static jakarta.persistence.FetchType.LAZY;

@Entity
@Getter
@Setter
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

     public void modifyAffectionPost(Post post){
        this.post=post;
    }

}
