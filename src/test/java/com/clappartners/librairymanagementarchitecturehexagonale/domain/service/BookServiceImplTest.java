//package com.clappartners.librairymanagementarchitecturehexagonale.domain.service;
//
//import com.clappartners.librairymanagementarchitecturehexagonale.domain.model.Author;
//import com.clappartners.librairymanagementarchitecturehexagonale.domain.model.Book;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//import java.time.LocalDate;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Optional;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//import static org.mockito.Mockito.*;
//
//@ExtendWith(MockitoExtension.class)
//public class BookServiceImplTest {
//    @Mock
//    private BookRepository bookRepository;
//    @InjectMocks
//    private BookService bookService;
//
//
//    @Test
//    public void testGetAllBooks() {
//        // given
//        Book book1 = new Book(1L, "Book One", 10.0, LocalDate.now());
//        Book book2 = new Book(2L, "Book Two", 15.0, LocalDate.now());
//        // when
//        when(bookRepository.findAll()).thenReturn(Arrays.asList(book1, book2));
//        // then
//        List<Book> books = bookService.getAllBooks();
//        assertEquals(2, books.size());
//        assertEquals("Book One", books.get(0).getTitle());
//        assertEquals("Book Two", books.get(1).getTitle());
//    }
//
//    @Test
//    public void testGetBookById() {
//        // given
//        Book book = new Book(1L, "Book One", 10.0, LocalDate.now());
//        // when
//        when(bookRepository.findById(1L)).thenReturn(Optional.of(book));
//        // then
//        Optional<Book> foundBook = bookService.getBookById(1L);
//        assertTrue(foundBook.isPresent());
//        assertEquals("Book One", foundBook.get().getTitle());
//    }
//
//    @Test
//    public void testSaveBook() {
//        // given
//        Author author = new Author(1L, "John", "Doe");
//        Book book = new Book(1L, "Book One", 10.0, LocalDate.now());
//        // when
//        when(bookRepository.save(book)).thenReturn(book);
//        // then
//        Book savedBook = bookService.saveBook(book);
//        assertEquals("Book One", savedBook.getTitle());
//    }
//
//    @Test
//    public void testDeleteBook() {
//        doNothing().when(bookRepository).deleteById(1L);
//        bookService.deleteBook(1L);
//        verify(bookRepository, times(1)).deleteById(1L);
//    }
//}
