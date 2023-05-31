/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.lopes.calculadorasalario;
import java.util.Scanner;



/**
 *
 * @author deuna
 */

        
public class CalculadoraSalario {

    public static void main(String[] args) {
        
        
        System.out.println("Digite seu nome: ");
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        
        System.out.println(nome + ", escolha dentre as opções a que se "
                + "adeque a seu regime salarial:  1- CLT  2- Horista 3- PJ");
        int regime;
        regime = sc.nextInt();
        
        
       
         if (regime == 1){
           System.out.println("Qual seu salário mensal?");
           double salarioMensal= sc.nextDouble();         
          double salario= professorClt.calculoSalario(salarioMensal);
             System.out.println("Nome: "+ nome
             +  " - Salário a receber: " +salario);
         }
             else if(regime == 2){
                     System.out.println(nome+ ", qual seu ganho por hora?");
                     int horasTrabalhadas = sc.nextInt();
                     System.out.println(nome+ ", quantas horas trabalhadas?");
                     double valorHorasTrabalhadas= sc.nextDouble();
                     double salario = professorHorista.calculoSalario( horasTrabalhadas, valorHorasTrabalhadas);
                     System.out.println("Nome: "+ nome
             +  " - Salário a receber: " +salario);
                     } 
             else if (regime == 3) {
                 System.out.println(nome +", qual seu salário contratual?");
                 double salarioContratual= sc.nextDouble();         
          double salario= professorContrato.calculoSalario(salarioContratual);
             System.out.println("Nome: "+ nome
             +  " - Salário a receber: " +salario);
             }
             else {
                 System.out.println("Digitação Incorreta. Tente novamente!");
             }
        
        
       
         }
    }

   
  
    

