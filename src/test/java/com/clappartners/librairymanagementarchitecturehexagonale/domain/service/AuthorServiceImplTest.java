package com.clappartners.librairymanagementarchitecturehexagonale.domain.service;

import com.clappartners.librairymanagementarchitecturehexagonale.domain.model.Author;
import com.clappartners.librairymanagementarchitecturehexagonale.infrastrecture.entity.AuthorEntity;
import com.clappartners.librairymanagementarchitecturehexagonale.infrastrecture.mapper.AuthorMapper;
import com.clappartners.librairymanagementarchitecturehexagonale.infrastrecture.repository.AuthorRepository;
import com.clappartners.librairymanagementarchitecturehexagonale.usecase.AuthorServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class AuthorServiceImplTest {

    @Mock
    private AuthorRepository authorRepository;
    @InjectMocks
    private AuthorServiceImpl authorService;

    @Test
    public void testGetAllAuthors() {
        //given
        AuthorEntity author1Provided = new AuthorEntity(1L, "Joe", "Bar");
        AuthorEntity author2Provided = new AuthorEntity(2L, "Eric", "lam");

        // when
        when(authorRepository.findAll()).thenReturn(Arrays.asList(author1Provided, author2Provided));

        // then
        List<AuthorEntity> authors = authorService.getAllAuthors();
        assertEquals(2, authors.size());
        assertEquals("Joe", authors.get(0).getFirstName());
        assertEquals("Eric", authors.get(1).getFirstName());
    }

    @Test
    public void testGetAuthorById() {
        //given
        AuthorEntity authorProvided = new AuthorEntity(1L, "Joe", "Bar");

        // when
        when(authorRepository.findById(1L)).thenReturn(Optional.of(authorProvided));

        // then
        Optional<AuthorEntity> foundAuthor = authorService.getAuthorById(1L);
        assertTrue(foundAuthor.isPresent());
        assertEquals("Joe", foundAuthor.get().getFirstName());
    }

    @Test
    public void testSaveAuthor() {
        AuthorEntity author = new AuthorEntity(1L, "John", "Doe");

        when(authorRepository.save(author)).thenReturn(author);

        AuthorEntity savedAuthor = authorService.saveAuthor(author);
        assertEquals("John", savedAuthor.getFirstName());
    }

    @Test
    public void testDeleteAuthor() {
        doNothing().when(authorRepository).deleteById(1L);
        authorService.deleteAuthor(1L);
        verify(authorRepository, times(1)).deleteById(1L);
    }
}