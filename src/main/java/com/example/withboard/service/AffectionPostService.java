package com.example.withboard.service;

import com.example.withboard.common.dto.BaseResponse;
import com.example.withboard.config.BaseException;
import com.example.withboard.domain.AffectionPost;
import com.example.withboard.domain.Post;
import com.example.withboard.domain.User;
import com.example.withboard.dto.AffectionPostAllResponseDto;
import com.example.withboard.dto.AffectionPostCreateDto;
import com.example.withboard.dto.AffectionPostDetailResponseDto;
import com.example.withboard.dto.AffectionPostRequestUpdateDto;
import com.example.withboard.repository.AffectionRepository;
import com.example.withboard.repository.PostRepository;
import com.example.withboard.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

import static com.example.withboard.common.BaseResponseStatus.FAILURE;

@Service
@RequiredArgsConstructor
@Slf4j
@Transactional
public class AffectionPostService {

    private final AffectionRepository affectionRepository;
    private final UserRepository userRepository;
    public List<AffectionPostAllResponseDto> findAllAffectionPost(){
        List<AffectionPost> affectionList = affectionRepository.findAll();

        return affectionList.stream()
                .map((eachAffection)-> AffectionPostAllResponseDto.of(eachAffection))
                .toList();
    }


    public AffectionPostDetailResponseDto findDetailAffectionPost(Long AffectionPostId){
        AffectionPost affectionPost = affectionRepository.findById(AffectionPostId).orElse(null);

        AffectionPostDetailResponseDto affectionPostDetailResponseDto = AffectionPostDetailResponseDto.of(affectionPost);

        return affectionPostDetailResponseDto;
    }


    public void deleteAffectionPost(Long affectionPostId){
        affectionRepository.deleteById(affectionPostId);
    }

    public AffectionPost save(Post createdPost, Long userId) {

        AffectionPost affectionPost = new AffectionPost();
        affectionPost.setPost(createdPost);
        affectionPost.setUser(userRepository.findUserById(userId).orElseThrow());
        affectionRepository.save(affectionPost);
        return  affectionPost;
    }



    public void modifyAffectionPost(Long affectionPostId, AffectionPostRequestUpdateDto affectionPostRequestUpdateDto){
        AffectionPost affectionPost = affectionRepository.findById(affectionPostId).orElse(null);

        Post post = affectionPost.getPost();
        post.modifyPost(affectionPostRequestUpdateDto.getTitle(), affectionPostRequestUpdateDto.getContent());

        affectionPost.modifyAffectionPost(post);

        affectionRepository.save(affectionPost);
    }

}
