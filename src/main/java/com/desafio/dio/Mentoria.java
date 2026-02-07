package com.desafio.dio;

import java.time.LocalDate;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Mentoria extends Conteudo {

    private LocalDate dataMentoria;

    public Mentoria() {

    };

}
