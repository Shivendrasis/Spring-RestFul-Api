package com.SpringApi.Api.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.SpringApi.Api.Entities.Books;
import com.SpringApi.Api.Service.BookService;

@RestController
public class Controller {

    @Autowired
    private BookService bookservice;

    @GetMapping("/home")
    public String home() {
        return "This is home page";
    }

    // GET all books
    @GetMapping("/books")
    public List<Books> getBooks() {
        return this.bookservice.getBooks();
    }

    // GET books by id
    @GetMapping("/books/{bookId}")
    public Books getBook(@PathVariable int bookId) {
        return this.bookservice.getBook(bookId);
    }

    // POST add books
    @PostMapping("/books")
    public Books addBooks(@RequestBody Books book) {
        return this.bookservice.addBooks(book);
    }

    // PUT update the books
    @PutMapping("/books/{id}")
    public Books updateBook(@PathVariable int id, @RequestBody Books book) {
        return this.bookservice.updateBooks(id, book); // Fixed method call
    }

    // DELETE delete a book
    @DeleteMapping("/books/{id}")
    public String deleteBook(@PathVariable int id) {
        return this.bookservice.deleteBook(id); // Fixed method call
    }
}
