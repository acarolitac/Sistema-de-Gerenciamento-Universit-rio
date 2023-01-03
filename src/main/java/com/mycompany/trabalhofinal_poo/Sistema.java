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

        al1.setMatricula(01234);
        al2.setMatricula(45670);
        al3.setMatricula(89700);

        System.out.println("Aluno(a) 1:" + "\nNome: " + al1.getNome() + "\nCurso: " + al1.getCurso() + "\nMatricula: " + al1.getMatricula());
        System.out.println("\nAluno(a) 2:" + "\nNome: " + al2.getNome() + "\nCurso: " + al2.getCurso() + "\nMatricula: " + al2.getMatricula());
        System.out.println("\nAluno(a) 3:" + "\nNome: " + al3.getNome() + "\nCurso: " + al3.getCurso() + "\nMatricula: " + al3.getMatricula());

        Professor[] prof = new Professor[3];
        Professor prof1 = new Professor("João", "0434343", "Brasília", "123433");
        Professor prof2 = new Professor("Maria", "23434343", "Taguatinga", "123456667");
        Professor prof3 = new Professor("José", "2113434342", "Asa Sul", "1234432");
        prof1.setNome("João");
        prof1.setNome("Maria");
        prof1.setNome("José");
        prof1.setDisciplina("POO");
        prof2.setDisciplina("SAA");
        prof3.setDisciplina("BDII");
        prof1.setCargaHoraria(70);
        prof2.setCargaHoraria(70);
        prof3.setCargaHoraria(70);
        System.out.println("\nDocente 1:" + "\nNome: " + prof1.getNome() + "\nDisciplina: " + prof1.getDisciplina() + "\nCarga Horaria: " + prof1.getCargaHoraria());
        System.out.println("Docente 2:" + "\nNome: " + prof2.getNome() + "\nDisciplina: " + prof2.getDisciplina() + "\nCarga Horaria: " + prof2.getCargaHoraria());
        System.out.println("Docente 3:" + "\nNome: " + prof3.getNome() + "\nDisciplina: " + prof3.getDisciplina() + "\nCarga Horaria: " + prof3.getCargaHoraria());

    }
}
