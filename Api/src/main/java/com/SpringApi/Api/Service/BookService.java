package com.SpringApi.Api.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.SpringApi.Api.Entities.Books;

@Service
public interface BookService {

    // abstrct methods

    public List<Books> getBooks();

    public Books getBook(int bookId);

    public Books addBooks(Books book);

    public Books updateBooks(int id, Books book);

    public String deleteBook(int id);

}
