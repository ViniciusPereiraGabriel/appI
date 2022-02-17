/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulajava.condicional.If1;

/**
 *
 * @author QI
 */
public class If2 {
     public static void main(String[] args) {
         double nota1 = 10.00;
        double nota2 = 8.00;
         
         boolean maior = nota1 > nota2;
         
         System.out.println("Maior " + maior);
         boolean maiorigual = nota1 >= nota2;
         
         System.out.println("Maior ou igual" + maiorIgual);
         boolean igual = nota1 == nota2;
         
         System.out.println("igual" +igual);
         boolean menorIgual = nota1 <= nota2;
                 
         System.out.println("Menor ou Igual:" + menorIgual);
          boolean diferente = nota1 != nota2;
          
          System.out.println("Diferente;" +diferente);
     }
    
}
