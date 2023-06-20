package kr.yuns.springinit.service;

import kr.yuns.springinit.data.dto.PostDto;
import kr.yuns.springinit.data.dto.PostResponseDto;
import kr.yuns.springinit.data.dto.PostUpdateDto;

public interface PostService {
    PostResponseDto getPost(Long id);
    PostResponseDto newPost(PostDto postDto);
    PostResponseDto modifyPost(PostUpdateDto postUpdateDto);
    void deletePost(Long id) throws Exception;
}
