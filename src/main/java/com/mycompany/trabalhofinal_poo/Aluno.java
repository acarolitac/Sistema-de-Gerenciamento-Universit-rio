/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhofinal_poo;

/**
 *
 * @author Ana Carolina, Marcela e Júlia
 */
public class Aluno extends Pessoa {

    private String curso;
    private int matricula;

    public Aluno(String nomeCompleto, String cpf, String endereco, String telefone) {
        super(nomeCompleto, cpf, endereco, telefone);
        this.curso = curso;
        this.matricula = matricula;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return this.curso;
    }

    public int getMatricula() {
        return this.matricula;
    }

    /**
     *
     */
    @Override
    public void mostrarDados() {
        System.out.println("\nAluno");
        super.mostrarDados();
        System.out.println("Matrícula: " + matricula);
        System.out.println("Curso: " + curso);
    }
}
