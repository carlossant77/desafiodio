package com.desafio.dio;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Curso extends Conteudo {

    private int cargaHoraria;

    public Curso() {

    };

    @Override
    public double calcularXP() {
        return cargaHoraria * XP_PADRAO;
    }

    @Override
    public String toString() {
        return String.format("""
                Curso: {
                nome: "%s"
                descricao: "%s"
                cargaHoraria: "%s"
                }
                """, getNome(), getDescricao(), getCargaHoraria());
    }

}
