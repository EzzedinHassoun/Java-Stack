package com.example.demo.mvc.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.example.demo.mvc.models.Book;
import com.example.demo.mvc.service.BookService;

@RestController
@RequestMapping("/api/books")
public class BookApi {

    private final BookService bookService;
    public BookApi(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<Book> index() {
        return bookService.allBooks();
    }

    @PostMapping
    public Book create(
            @RequestParam String title,
            @RequestParam String description,
            @RequestParam String language,
            @RequestParam Integer pages) {
        Book newBook = new Book(title, description, language, pages);
        return bookService.createBook(newBook);
    }

    @GetMapping("/{id}")
    public Book show(@PathVariable Long id) {
        return bookService.findBook(id);
    }

    @PutMapping("/{id}")
    public Book update(
            @PathVariable Long id,
            @RequestParam String title,
            @RequestParam String description,
            @RequestParam String language,
            @RequestParam Integer pages) {
        return bookService.updateBook(id, title, description, language, pages);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        bookService.deleteBook(id);
    }
}
