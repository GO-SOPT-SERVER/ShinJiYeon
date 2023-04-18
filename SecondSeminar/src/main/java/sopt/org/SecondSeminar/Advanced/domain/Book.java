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

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
