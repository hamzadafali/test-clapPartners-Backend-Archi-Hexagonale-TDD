package com.clappartners.librairymanagementarchitecturehexagonale.usecase;

import com.clappartners.librairymanagementarchitecturehexagonale.domain.service.AuthorService;
import com.clappartners.librairymanagementarchitecturehexagonale.infrastrecture.entity.AuthorEntity;
import com.clappartners.librairymanagementarchitecturehexagonale.infrastrecture.repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public List<AuthorEntity> getAllAuthors() {
        return authorRepository.findAll();
    }

    @Override
    public Optional<AuthorEntity> getAuthorById(long id) {
        return authorRepository.findById(id);
    }

    @Override
    public AuthorEntity saveAuthor(AuthorEntity author) {
        return authorRepository.save(author);
    }

    @Override
    public void deleteAuthor(long id) {
        authorRepository.deleteById(id);
    }
}
