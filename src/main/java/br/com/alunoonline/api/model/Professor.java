package br.com.alunoonline.api.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "professor")
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeCompleto;
    private String email;
    private String cpf;
}