package sopt.org.SecondSeminar.Advanced.service;

import org.springframework.stereotype.Service;
import sopt.org.SecondSeminar.Advanced.controller.dto.PriceUpdateDto;
import sopt.org.SecondSeminar.Advanced.controller.dto.RegisterRequestDto;
import sopt.org.SecondSeminar.Advanced.domain.Book;

import java.util.ArrayList;

import static sopt.org.SecondSeminar.SecondSeminarApplication.bookList;
import static sopt.org.SecondSeminar.SecondSeminarApplication.postList;

@Service
public class BookService {

    public long register(RegisterRequestDto request) {
        Book book = Book.builder()
                .title(request.getTitle())
                .author(request.getAuthor())
                .price(request.getPrice())
                .build();

        book.setId((long) postList.size());
        bookList.add(book);

        return book.getId();
    }

    public Book updatePrice(PriceUpdateDto priceUpdateDto) {
        //예외 처리 X
        Book book = bookList.get(priceUpdateDto.getId().intValue());

        book.updatePrice(priceUpdateDto.getPrice());

        return book;
    }

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public void deleteOne(Long bookId) {
        //예외 처리 X
        bookList.remove(bookId.intValue());
    }
}
