package com.biblioteca.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Livro
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID ID;

    @Column
    private String titulo;

    @Column
    private String autor;

    @Column
    private String editora;

    @Column
    private int anoPublicacao;

    @Column
    private String categoria;

}
