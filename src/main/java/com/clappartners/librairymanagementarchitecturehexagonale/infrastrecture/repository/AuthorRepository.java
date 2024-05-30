package com.clappartners.librairymanagementarchitecturehexagonale.infrastrecture.repository;

import com.clappartners.librairymanagementarchitecturehexagonale.infrastrecture.entity.AuthorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<AuthorEntity, Long> {
}
