package com.clappartners.librairymanagementarchitecturehexagonale.domain.repository;

import com.clappartners.librairymanagementarchitecturehexagonale.domain.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookRepository {
    List<Book> findAll();

    Optional<Book> findById(long l);

    Book save(Book book);

    void deleteById(long l);
}
