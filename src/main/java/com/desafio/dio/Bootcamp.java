package com.desafio.dio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import lombok.Data;

@Data
public class Bootcamp {

    private LocalDate dataInicial;
    private LocalDate dataFinal;
    private String nome;
    private String descricao;
    private Set<Dev> devs = new HashSet<>();
    private Set<Mentoria> mentorias = new LinkedHashSet<>();
    private Set<Curso> cursos = new LinkedHashSet<>();

}
