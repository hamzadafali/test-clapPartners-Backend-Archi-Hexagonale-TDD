package com.clappartners.librairymanagementarchitecturehexagonale.domain.service;

import com.clappartners.librairymanagementarchitecturehexagonale.domain.model.Author;

import java.util.List;
import java.util.Optional;

public interface AuthorService {
    List<Author> getAllAuthors();

    Optional<Author> getAuthorById(long l);

    Author saveAuthor(Author author);

    void deleteAuthor(long l);
}
