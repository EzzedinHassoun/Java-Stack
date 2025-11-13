package com.axsosacademy.mvc;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.axsosacademy.mvc.models.Book;
import com.axsosacademy.mvc.services.BookService;

@Controller
public class BookController {
    private final BookService bookService;
    
    public BookController(BookService bookService){
        this.bookService = bookService;
    }



    @GetMapping("/create")
    public String create(Model model){
        Book b = new Book("hello", "desc2iueirutueitue","lang",500);
        Book b2 = new Book("hello2", "desc2iueirutueitue","lang2",500);


        bookService.createBook(b);
        bookService.createBook(b2);
        return  "index.jsp";
    }
    @RequestMapping(value="/books/{id}", method=RequestMethod.GET)
    public String viewBook(Model model, @PathVariable("id") Long id) {
        Book book = bookService.findBook(id);
        model.addAttribute("book", book);
        return "index.jsp";
    }
    
    @RequestMapping(value="/books", method=RequestMethod.GET)
    public String viewAllBook(Model model) {
        List<Book> books = bookService.allBooks();
        model.addAttribute("books", books);
        return "all_books.jsp";
    }
    
}