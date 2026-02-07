package com.desafio.dio;

import lombok.Data;

@Data
public abstract class Conteudo {

    protected static final double XP_PADRAO = 10;

    private String name;
    private String descricao;

    public abstract double calcularXP();

}
