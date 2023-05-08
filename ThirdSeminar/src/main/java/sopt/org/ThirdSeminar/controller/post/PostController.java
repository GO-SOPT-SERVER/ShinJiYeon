package sopt.org.ThirdSeminar.controller.post;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sopt.org.ThirdSeminar.common.dto.ApiResponseDto;
import sopt.org.ThirdSeminar.controller.post.dto.request.PostCreateDto;
import sopt.org.ThirdSeminar.exception.SuccessStatus;
import sopt.org.ThirdSeminar.service.PostService;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @PostMapping("/post/{userId}")
    public ApiResponseDto create(@PathVariable final Long userId, @RequestBody @Valid final PostCreateDto postCreateDto) {
        return ApiResponseDto.success(SuccessStatus.POST_CREATE_SUCCESS, postService.create(userId, postCreateDto));
    }

    @GetMapping("/post/{postId}")
    public ApiResponseDto getOne(@PathVariable final Long postId) {
        return ApiResponseDto.success(SuccessStatus.POST_INQUIRY_SUCCESS, postService.getOne(postId));
    }

}
