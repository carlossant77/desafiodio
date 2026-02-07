package com.desafio.dio;

import java.util.LinkedHashSet;
import java.util.Set;

import lombok.Data;

@Data
public class Dev {

    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

}
