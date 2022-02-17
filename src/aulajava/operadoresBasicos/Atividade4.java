/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulajava.operadoresBasicos;

import java.util.Scanner;

/**
 *
 * @author QI
 */
public class Atividade4 {
       public static void main(String[] args) { 
          Scanner ler = new Scanner(System.in);
        
        double valor = 25;
        
        int qtde = 0;
        
        String nome;
        
        System.out.println("Ingressos do show da virada");
        System.out.println("Digite seu nome:");
        nome = ler.next();
        
        
        
        System.out.println("Digite a quantidade");
        qtde = ler.nextInt();
        
        valorTotal total = nome*qtde;
        
        System.out.println("Valor total dos ingressos");
        

      }
              
    
}

    

