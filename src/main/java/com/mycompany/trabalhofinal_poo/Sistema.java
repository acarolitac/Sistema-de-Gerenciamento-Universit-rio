/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhofinal_poo;

import java.util.Arrays;

/**
 *
 * @author Ana Carolina, Marcela e Júlia
 */
public class Sistema {

    public static void main(String[] args) {

        Turma a = new Turma("A");
        a.mostrarDadosTurma();

        String[] strings = new String[3];

        Aluno[] al = new Aluno[3];
        Aluno al1 = new Aluno("Ana", "0434343", "Brasília", "123433");
        Aluno al2 = new Aluno("Júlia", "0434343", "Brasília", "123433");
        Aluno al3 = new Aluno("Marcela", "0434343", "Brasília", "123433");

        al1.setNome("Ana");
        al2.setNome("Júlia");
        al3.setNome("Marcela");
        al1.setCurso("Sistemas para internet");
        al2.setCurso("Administração");
        al3.setCurso("ETC");

        al1.setMatricula(12345);
        al2.setMatricula(45670);
        al3.setMatricula(89700);

        System.out.println("\nAluno(a) 1:" + "\nNome: " + al1.getNome() + "\nCurso: " + al1.getCurso() + "\nMatricula: " + al1.getMatricula());
        System.out.println("\nAluno(a) 2:" + "\nNome: " + al2.getNome() + "\nCurso: " + al2.getCurso() + "\nMatricula: " + al2.getMatricula());
        System.out.println("\nAluno(a) 3:" + "\nNome: " + al3.getNome() + "\nCurso: " + al3.getCurso() + "\nMatricula: " + al3.getMatricula());

        Professor[] prof = new Professor[3];
        Professor prof1 = new Professor("João", "0434343", "Brasília", "123433");
        prof1.setNome("João");
        prof1.setNome("Maria");
        prof1.setNome("José");
        prof1.setDisciplina("Programação Orientada a Objetos");
        prof1.setCargaHoraria(70);
        prof1.mostrarDados();

    }
}
