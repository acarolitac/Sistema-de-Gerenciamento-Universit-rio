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
public class Turma {
    private String nomeTurma;
    public static int numTurma = 1;
    
    public Turma(String nomeTurma){
        this.nomeTurma = nomeTurma + numTurma;
    }
    
    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma + numTurma;
    }
    
    public void mostrarDadosTurma() {
        System.out.println("Turma " + nomeTurma);
    }
}
