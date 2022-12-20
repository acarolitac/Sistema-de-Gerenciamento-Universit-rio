/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhofinal_poo;

/**
 *
 * @author Ana Carolina, Marcela e Júlia
 */
public class Sistema {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ana", "000-000-000.00", "Brasília", "123");
        a1.setCurso("Sistemas para Internet");
        a1.setMatricula(123456789);
        a1.mostrarDados();
    }
}
