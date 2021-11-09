package com.company.demo.service;

import com.company.demo.model.Book;

import java.util.List;

public interface BookService {
    public void createBook(Book book);

    public void updateBook(Book book);

    public void deleteBook(int id);

    public Book getBookById(int id);

    public List<Book> listBooks();
}
