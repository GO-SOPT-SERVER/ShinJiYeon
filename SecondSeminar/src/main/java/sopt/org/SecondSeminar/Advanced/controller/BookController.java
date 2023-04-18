package sopt.org.SecondSeminar.Advanced.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sopt.org.SecondSeminar.Advanced.controller.dto.BookInfoResponseDto;
import sopt.org.SecondSeminar.Advanced.controller.dto.PriceUpdateDto;
import sopt.org.SecondSeminar.Advanced.controller.dto.RegisterRequestDto;
import sopt.org.SecondSeminar.Advanced.domain.Book;
import sopt.org.SecondSeminar.Advanced.service.BookService;

@RestController
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

    @PostMapping("/book")
    public void register(@RequestBody RegisterRequestDto request) {
        bookService.register(request);
    }

    @PutMapping("/book")
    public BookInfoResponseDto updatePrice(@RequestBody PriceUpdateDto priceUpdateDto) {
        Book book = bookService.updatePrice(priceUpdateDto);
        return new BookInfoResponseDto(book);
    }
}
