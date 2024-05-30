package com.clappartners.librairymanagementarchitecturehexagonale.domain.model;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Book {

    private Long id;
    private String title;
    private double price;
    private LocalDate dateOfPublication;
}
