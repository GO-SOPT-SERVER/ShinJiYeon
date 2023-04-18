package sopt.org.SecondSeminar.Advanced.service;

import org.springframework.stereotype.Service;
import sopt.org.SecondSeminar.Advanced.controller.dto.BookRequestDto;
import sopt.org.SecondSeminar.Advanced.domain.Book;

import static sopt.org.SecondSeminar.SecondSeminarApplication.bookList;
import static sopt.org.SecondSeminar.SecondSeminarApplication.postList;

@Service
public class BookService {

    public long register(BookRequestDto request) {
        Book book = Book.builder()
                .title(request.getTitle())
                .author(request.getAuthor())
                .price(request.getPrice())
                .build();

        book.setId((long) postList.size());
        bookList.add(book);

        return book.getId();
    }
}
