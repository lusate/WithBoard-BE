package com.example.withboard.service;

import com.example.withboard.domain.AffectionPost;
import com.example.withboard.domain.TogetherPost;
import com.example.withboard.dto.AffectionPostAllResponseDto;
import com.example.withboard.dto.TogetherPostAllResponseDto;
import com.example.withboard.repository.TogetherRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;


@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class TogetherPostService {

    private final TogetherRepository togetherRepository;
    public List<TogetherPostAllResponseDto> findAllTogetherPost(){
        List<TogetherPost> togetherList = togetherRepository.findAll();

        return togetherList.stream()
                .map(TogetherPostAllResponseDto::of)
                .toList();
    }

}
