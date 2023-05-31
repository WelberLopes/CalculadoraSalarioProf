/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lopes.calculadorasalario;

import com.lopes.calculadorasalario.Professor;

/**
 *
 * @author deuna
 */
public class professorHorista extends Professor{
    
    public static int horasTrabalhadas;
    public static double valorHorasTrabalhadas;

   
    
    
     public static double calculoSalario(int horasTrabalhadas, double valorHorasTrabalhadas) {

double salario = horasTrabalhadas * valorHorasTrabalhadas;
return salario;


}
    
    
    
    
    
    
}
