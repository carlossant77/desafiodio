package com.desafio.dio;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Curso extends Conteudo {

    private int cargaHoraria;

    public Curso() {

    };

}
