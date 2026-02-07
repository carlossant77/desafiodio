package com.desafio.dio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setName("Java course");
        curso.setDescricao("Curso de Java, em Java");
        curso.setCargaHoraria(50);

        Curso curso2 = new Curso();
        curso2.setName("Curso JS");
        curso2.setDescricao("Curso de Javascript");
        curso2.setCargaHoraria(40);

        Mentoria mentoria = new Mentoria();
        mentoria.setName("Mentoria de Java");
        mentoria.setDescricao("Uma mentoria de Java");
        mentoria.setDataMentoria(LocalDate.now());

        System.out.print(mentoria.toString());
    }

}