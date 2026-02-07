package com.desafio.dio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setNome("Java course");
        curso.setDescricao("Curso de Java, em Java");
        curso.setCargaHoraria(50);

        Curso curso2 = new Curso();
        curso2.setNome("Curso JS");
        curso2.setDescricao("Curso de Javascript");
        curso2.setCargaHoraria(40);

        Mentoria mentoria = new Mentoria();
        mentoria.setNome("Mentoria de Java");
        mentoria.setDescricao("Uma mentoria de Java");
        mentoria.setDataMentoria(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp Java");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev = new Dev();
        dev.setNome("Joseph");
        dev.inscricaoBootcamp(bootcamp);
    }

}