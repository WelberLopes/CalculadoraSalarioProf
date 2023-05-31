/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lopes.calculadorasalario;

/**
 *
 * @author deuna
 */
public abstract class Professor {
    
    private double salarioMensal;
    private String nome;

    public double recebeSalario() {
        return salarioMensal;
    }

    public void alteraSalario(double salario) {
        this.salarioMensal = salario;
    }

    
}



