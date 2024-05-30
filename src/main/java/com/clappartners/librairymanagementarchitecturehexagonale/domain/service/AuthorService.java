package com.clappartners.librairymanagementarchitecturehexagonale.domain.service;

import com.clappartners.librairymanagementarchitecturehexagonale.infrastrecture.entity.AuthorEntity;

import java.util.List;
import java.util.Optional;

public interface AuthorService {
    List<AuthorEntity> getAllAuthors();

    Optional<AuthorEntity> getAuthorById(long l);

    AuthorEntity saveAuthor(AuthorEntity author);

    void deleteAuthor(long l);
}
