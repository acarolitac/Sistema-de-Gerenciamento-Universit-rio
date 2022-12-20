/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhofinal_poo;

/**
 *
 * @author Ana Carolina, Marcela e Júlia
 */
public class Professor extends Pessoa {

    private String disciplina;
    private int cargaHoraria;

    public Professor(String nomeCompleto, String cpf, String endereco, String telefone) {
        super(nomeCompleto, cpf, endereco, telefone);
        this.disciplina = disciplina;
        this.cargaHoraria = cargaHoraria;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getDisciplina() {
        return this.disciplina;
    }

    public int getCargaHoraria() {
        return this.cargaHoraria;
    }

    /**
     *
     */
    @Override
    public void mostrarDados() {
        System.out.println("\nProfessor");
        super.mostrarDados();
        System.out.println("Disciplina: " + disciplina);
        System.out.println("Carga horária: " + cargaHoraria);
    }
}
