package sopt.org.ThirdSeminar.controller.post.dto.response;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class PostResponseDto {
    private String title;
    private String content;
    private String authorName;

    public static PostResponseDto of(String title, String content, String authorName) {
        return new PostResponseDto(title, content, authorName);
    }
}
