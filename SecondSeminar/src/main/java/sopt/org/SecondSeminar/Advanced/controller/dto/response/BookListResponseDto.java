package sopt.org.SecondSeminar.Advanced.controller.dto.response;

import lombok.Getter;
import sopt.org.SecondSeminar.Advanced.domain.Book;

import java.util.ArrayList;
import java.util.List;

@Getter
public class BookListResponseDto {
    List<BookInfoResponseDto> bookInfoList;

    public BookListResponseDto(List<Book> bookList) {
        bookInfoList = new ArrayList<>();
        bookList.forEach(book -> bookInfoList.add(new BookInfoResponseDto(book)));
    }
}
