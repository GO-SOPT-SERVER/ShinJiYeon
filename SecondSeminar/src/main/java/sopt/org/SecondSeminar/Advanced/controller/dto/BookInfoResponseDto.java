package sopt.org.SecondSeminar.Advanced.controller.dto;

import lombok.Getter;
import sopt.org.SecondSeminar.Advanced.domain.Book;

@Getter
public class BookInfoResponseDto {
    private String title;

    private String author;

    private int price;

    public BookInfoResponseDto(Book book) {
        this.title = book.getTitle();
        this.author = book.getAuthor();
        this.price = book.getPrice();
    }
}
