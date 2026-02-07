package com.desafio.dio;

import lombok.Data;

@Data
public class Curso {
    private String name;

    private String descricao;

    private int cargaHoraria;

    public Curso() {

    };

    public void calcularXP() {
    };
}
