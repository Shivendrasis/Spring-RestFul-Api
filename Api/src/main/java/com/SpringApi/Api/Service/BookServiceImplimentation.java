package com.SpringApi.Api.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.SpringApi.Api.Entities.Books;

@Service
public class BookServiceImplimentation implements BookService {

    // Temp list
    List<Books> list;

    public BookServiceImplimentation() {
        list = new ArrayList<>();
        list.add(new Books(200, "Core Java", "Learn core java from basic", 1499));
        list.add(new Books(300, "Spring Security", "Learn about Advanced spring security", 999));
        list.add(new Books(400, "C++", "Lets start coding with c++", 499));
    }

    @Override
    public List<Books> getBooks() {
        return list;
    }

    @Override
    public Books getBook(int bookId) {
        for (Books book : list) {
            if (book.getId() == bookId) {
                return book;
            }
        }
        return null; // Book not found
    }

    @Override
    public Books addBooks(Books book) {
        list.add(book);
        return book;
    }

    @Override
    public Books updateBooks(int id, Books book) {
        for (Books b : list) {
            if (b.getId() == id) {
                b.setName(book.getName());
                b.setTitle(book.getTitle());
                b.setPrice(book.getPrice());
                return b; // Return the updated book
            }
        }
        return null; // Book not found
    }

    @Override
    public String deleteBook(int id) {
        for (Books b : list) {
            if (b.getId() == id) {
                list.remove(b);
                return "Deleted " + id + " Successfully";
            }
        }
        return "Invalid ID"; // Book not found
    }
}
