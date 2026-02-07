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

    @Override
    public double calcularXP() {
        return 20 + XP_PADRAO;
    }

    @Override
    public String toString() {
        return String.format("""
                Mentoria: {
                nome: "%s"
                descricao: "%s"
                dataMentoria: "%s"
                }
                """, getNome(), getDescricao(), getDataMentoria());
    }

}
