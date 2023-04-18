package sopt.org.SecondSeminar.Advanced.controller.dto.request;

import lombok.Getter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
public class RegisterRequestDto {
    @NotBlank(message = "도서 제목은 필수입니다.")
    private String title;

    @NotBlank(message = "도서 제목은 필수입니다.")
    private String author;

    @NotNull(message = "도서 가격은 필수입니다.")
    private int price;
}
