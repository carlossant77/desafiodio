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

    public String toString() {
        return String.format("""
                Curso: {
                nome: "%s"
                descricao: "%s"
                cargaHoraria: "%s"
                }
                """, getName(), getDescricao(), getCargaHoraria());
    }

}
