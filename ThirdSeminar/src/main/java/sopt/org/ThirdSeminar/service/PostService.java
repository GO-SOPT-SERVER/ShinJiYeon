package sopt.org.ThirdSeminar.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sopt.org.ThirdSeminar.controller.post.dto.request.PostCreateDto;
import sopt.org.ThirdSeminar.controller.post.dto.response.PostResponseDto;
import sopt.org.ThirdSeminar.domain.Post;
import sopt.org.ThirdSeminar.domain.User;
import sopt.org.ThirdSeminar.exception.BusinessException;
import sopt.org.ThirdSeminar.exception.ErrorStatus;
import sopt.org.ThirdSeminar.infrastructure.PostRepository;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;
    private final UserService userService;

    @Transactional
    public PostResponseDto create(Long userId, PostCreateDto postCreateDto) {
        User userById = userService.findUserById(userId);

        Post post = Post.builder()
                .title(postCreateDto.getTitle())
                .content(postCreateDto.getContent())
                .user(userById)
                .build();

        postRepository.save(post);

        return PostResponseDto.of(post.getTitle(), post.getContent(), userById.getNickname());
    }

    @Transactional(readOnly = true)
    public PostResponseDto getOne(Long postId) {
        Post post = postRepository.findById(postId)
                .orElseThrow(() -> new BusinessException(ErrorStatus.POST_NOT_FOUND));

        return PostResponseDto.of(post.getTitle(), post.getContent(), post.getUser().getNickname());
    }
}
