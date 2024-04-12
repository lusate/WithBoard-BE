package com.example.withboard.service;

import com.example.withboard.common.dto.BaseResponse;
import com.example.withboard.domain.AffectionPost;
import com.example.withboard.domain.Post;
import com.example.withboard.dto.AffectionPostAllResponseDto;
import com.example.withboard.repository.AffectionRepository;
import com.example.withboard.repository.PostRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
@Transactional
public class AffectionPostService {

    private final AffectionRepository affectionRepository;
    private final PostRepository postRepository;
    public List<AffectionPostAllResponseDto> findAllAffectionPost(){
        List<AffectionPost> affectionList = affectionRepository.findAll();

        return affectionList.stream()
                .map((eachAffection)-> AffectionPostAllResponseDto.of(eachAffection))
                .toList();
    }

    public void deleteAffectionPost(Long employmentId){
        affectionRepository.deleteById(employmentId);
    }



}
