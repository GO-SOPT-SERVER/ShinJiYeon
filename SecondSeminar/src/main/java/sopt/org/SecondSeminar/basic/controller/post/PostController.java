package sopt.org.SecondSeminar.basic.controller.post;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sopt.org.SecondSeminar.basic.controller.post.dto.request.RegisterRequestDto;
import sopt.org.SecondSeminar.basic.domain.post.Post;
import sopt.org.SecondSeminar.basic.service.PostService;

import static sopt.org.SecondSeminar.SecondSeminarApplication.postList;

@RestController
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    @PostMapping("/post")
    public String register(@RequestBody RegisterRequestDto request) {
        Long postId = postService.register(request);
        System.out.println(postList.get(postId.intValue() -1).toString());

        return "게시물 등록이 완료되었습니다.";
    }

    @GetMapping("/post/{postId}")
    public String getOne(@PathVariable final Long postId) {
        Post postById = postService.getPostById(postId);

        System.out.println(postById.toString());

        return "게시물 조회 성공";
    }

    @GetMapping("/post/search")
    public String search(@RequestParam final String postTitle) {
        Post postByTitle = postService.getPostByTitle(postTitle);

        if(postByTitle != null) {
            System.out.println(postByTitle.toString());
            return "검색어로 조회 완료";
        }else {
            return "해당 타이틀의 게시물이 존재하지 않습니다.";
        }
    }
}
