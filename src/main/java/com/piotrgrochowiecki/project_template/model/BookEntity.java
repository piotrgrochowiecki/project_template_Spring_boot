package com.piotrgrochowiecki.project_template.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PositiveOrZero;
import java.util.List;

@Entity
@Table(name = "books")
@Getter
@Setter
@ToString(exclude = {"authors"})
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor @Builder
public class BookEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String title;
    @PositiveOrZero
    private int pages;

    @ManyToOne
    private AuthorEntity mainAuthor;

    @ManyToMany
    private List<AuthorEntity> authors; //jeśli mamy jakąś listę czy inną kolekcję, to trzeba je usunąć z @toStringa
}
