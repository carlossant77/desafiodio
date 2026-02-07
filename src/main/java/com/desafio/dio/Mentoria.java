package com.desafio.dio;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Mentoria {

    private String name;

    private String descricao;

    private LocalDate dataMentoria;

    public Mentoria() {

    };

    public void calcularXP() {
    };
}
