package com.clappartners.librairymanagementarchitecturehexagonale.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Author {

    private Long id;
    private String firstName;
    private String lastName;

}

