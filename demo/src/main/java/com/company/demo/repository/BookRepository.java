package com.company.demo.repository;

import com.company.demo.model.Book;

import java.util.List;

public interface BookRepository {
    public void createBook(Book book);
    public void updateBook(Book book);
    public void deleteBook(int id);
    public Book getBookById(int id);
    public List<Book> listBooks();
}
