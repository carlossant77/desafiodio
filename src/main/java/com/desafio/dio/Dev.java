package com.desafio.dio;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import lombok.Data;

@Data
public class Dev {

    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void inscricaoBootcamp(Bootcamp bootcamp) {
        conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevs().add(this);
    };

    public void progredir() {
        Optional<Conteudo> primeiroConteudo = conteudosInscritos.stream().findFirst();
        if (primeiroConteudo.isPresent()) {
            conteudosConcluidos.add(primeiroConteudo.get());
            conteudosInscritos.remove(primeiroConteudo.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }

    public double calcularTotalXP() {
        return conteudosConcluidos
                .stream()
                .mapToDouble(Conteudo::calcularXP)
                .sum();
    }

    public String exibirCursos() {
        return conteudosInscritos
                .stream()
                .map(conteudo -> conteudo.toString())
                .collect(Collectors.joining("\n"));
    }

}
