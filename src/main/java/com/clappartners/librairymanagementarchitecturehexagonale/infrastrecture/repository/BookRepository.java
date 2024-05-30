package com.clappartners.librairymanagementarchitecturehexagonale.infrastrecture.repository;

import com.clappartners.librairymanagementarchitecturehexagonale.infrastrecture.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookEntity, Long> {
}
