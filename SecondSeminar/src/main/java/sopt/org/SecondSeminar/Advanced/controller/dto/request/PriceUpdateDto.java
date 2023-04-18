package sopt.org.SecondSeminar.Advanced.controller.dto.request;

import lombok.Getter;

import javax.validation.constraints.NotNull;

@Getter
public class PriceUpdateDto {
    @NotNull(message = "도서 고유번호는 필수입니다.")
    private Long id;

    @NotNull(message = "도서 가격은 필수입니다.")
    private int price;
}
