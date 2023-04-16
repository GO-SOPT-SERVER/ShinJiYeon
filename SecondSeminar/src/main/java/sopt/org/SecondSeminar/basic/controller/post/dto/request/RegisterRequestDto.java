package sopt.org.SecondSeminar.basic.controller.post.dto.request;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class RegisterRequestDto {
    private String title;

    private String body;
}
