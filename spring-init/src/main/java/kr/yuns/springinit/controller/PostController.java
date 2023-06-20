package kr.yuns.springinit.controller;

import kr.yuns.springinit.data.dto.PostDto;
import kr.yuns.springinit.data.dto.PostResponseDto;
import kr.yuns.springinit.data.dto.PostUpdateDto;
import kr.yuns.springinit.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/post")
public class PostController {
    private final PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/get")
    public ResponseEntity<PostResponseDto> getPost(Long id) {
        PostResponseDto postResponseDto = postService.getPost(id);

        return ResponseEntity.status(HttpStatus.OK).body(postResponseDto);
    }

    @PostMapping("/new")
    public ResponseEntity<PostResponseDto> newPost(@RequestBody PostDto postDto) {
        PostResponseDto postResponseDto = postService.newPost(postDto);

        return ResponseEntity.status(HttpStatus.OK).body(postResponseDto);
    }

    @PutMapping("/modify")
    public ResponseEntity<PostResponseDto> modifyPost(@RequestBody PostUpdateDto postUpdateDto) throws Exception {
        PostResponseDto postResponseDto = postService.modifyPost(postUpdateDto);

        return ResponseEntity.status(HttpStatus.OK).body(postResponseDto);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> deletePost(Long id) throws Exception {
        postService.deletePost(id);

        return ResponseEntity.status(HttpStatus.OK).body("삭제가 정상적으로 완료되었습니다.");
    }
}
