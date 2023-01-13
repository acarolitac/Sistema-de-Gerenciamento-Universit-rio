/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhofinal_poo;

/**
 *
 * @author Ana Carolina, Marcela e Júlia
 */
public abstract class Pessoa {

    private String nomeCompleto;
    private String cpf;
    private String endereco;
    private String telefone;

    public Pessoa() {

    }

    public Pessoa(String nomeCompleto, String cpf, String endereco, String telefone) {
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public void setNome(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return this.nomeCompleto;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public String getTelefone() {
        return this.telefone;
    }
    
    /**
     *
     */
    public void mostrarDados() {
        System.out.println("Nome: " + nomeCompleto);
        System.out.println("CPF: " + cpf);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
    }
}
