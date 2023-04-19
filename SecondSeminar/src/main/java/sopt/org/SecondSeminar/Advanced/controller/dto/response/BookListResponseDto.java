package sopt.org.SecondSeminar.Advanced.controller.dto.response;

import lombok.Getter;
import sopt.org.SecondSeminar.Advanced.domain.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
public class BookListResponseDto {
    List<BookInfoResponseDto> bookInfoList;

    public BookListResponseDto(List<Book> bookList) {
        bookInfoList = bookList.stream().map(BookInfoResponseDto::new).collect(Collectors.toList());
    }
}
