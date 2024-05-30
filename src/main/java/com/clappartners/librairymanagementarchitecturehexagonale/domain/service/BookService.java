package com.clappartners.librairymanagementarchitecturehexagonale.domain.service;

import com.clappartners.librairymanagementarchitecturehexagonale.domain.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {
    List<Book> getAllBooks();

    Optional<Book> getBookById(long l);

    Book saveBook(Book book);

    void deleteBook(long l);
}
