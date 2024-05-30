package com.clappartners.librairymanagementarchitecturehexagonale.infrastrecture.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "AUTHORS")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AuthorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "AUTHOR_FIRSTNAME")
    private String firstName;
    @Column(name = "AUTHOR_LASTNAME")
    private String lastName;
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "author")
    private List<BookEntity> livres;

    public AuthorEntity(long l, String authorOne) {
    }

    public AuthorEntity(Long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
