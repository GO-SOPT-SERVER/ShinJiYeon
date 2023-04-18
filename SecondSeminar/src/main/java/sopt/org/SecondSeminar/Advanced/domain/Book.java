package sopt.org.SecondSeminar.Advanced.domain;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Book {
    private Long id;

    private String title;

    private String author;

    private int price;

    public void setId(Long id) {
        this.id = id;
    }

    public void updatePrice(int price) {
        this.price = price;
    }
}
