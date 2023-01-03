/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhofinal_poo;

/**
 *
 * @author Ana Carolina, Marcela e Júlia
 */
public class Colaboradores extends Pessoa {

    private String funcionarios;
    private String cargo;

    public Colaboradores(String nomeCompleto, String cpf, String endereco, String telefone) {
        super(nomeCompleto, cpf, endereco, telefone);
        this.funcionarios = funcionarios;
        this.cargo = cargo;
    }

    public String getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(String funcionarios) {
        this.funcionarios = funcionarios;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public void mostrarDados() {
        System.out.println("\nColaboradores:");
        super.mostrarDados();
        System.out.println("Funcionário: " + funcionarios);
        System.out.println("Cargo na instituição: " + cargo);
    }

}
