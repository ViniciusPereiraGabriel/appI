/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulajava;

import java.util.Scanner;

/**
 *
 * @author QI
 */
public class atividade {
    public static void main (String args[]){
        
       String nome;
       Scanner teclado;
       Scanner ler = new Scanner(System.in);
       Scanner Scanner = teclado = new Scanner(System.in);
    
        System.out.println("digite o nome do aluno:");
        nome = ler.nextLine();
      
        float nota1, nota2, nota3, media;
        
        
        System.out.println("Digite a nota 1:");
            nota1 = teclado.nextFloat();
            
        System.out.println("Digite a nota 2:");
            nota2 = teclado.nextFloat();
            
         System.out.println("Digite a nota 3:");
            nota3 = teclado.nextFloat();
            
            media = (nota1+nota2+nota3)/3;
            System.out.println("Sua nota final é " + media);
            
    
    }
}
