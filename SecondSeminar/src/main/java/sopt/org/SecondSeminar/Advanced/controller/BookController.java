package sopt.org.SecondSeminar.Advanced.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import sopt.org.SecondSeminar.Advanced.controller.dto.BookRequestDto;
import sopt.org.SecondSeminar.Advanced.service.BookService;

@RestController
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

    @PostMapping("/book")
    public void register(@RequestBody BookRequestDto request) {
        bookService.register(request);
    }
}
