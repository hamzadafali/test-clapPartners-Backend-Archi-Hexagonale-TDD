package com.clappartners.librairymanagementarchitecturehexagonale.domain.repository;

import com.clappartners.librairymanagementarchitecturehexagonale.domain.model.Author;

import java.util.List;

public interface AuthorRepository {
     List<Author> findAll();

    Object findById(long l);

    Object save(Author author);

    void deleteById(long l);
}
