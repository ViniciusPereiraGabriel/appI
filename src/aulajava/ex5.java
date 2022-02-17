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
public class ex5 {
     public static void main (String [] args){
     
     String nome;
     int idade;
     double altura;
     String endereco;
     String fim;
     
     Scanner ler = new Scanner(System.in);
     System.out.println("digite o nome da pessoa");
     nome = ler.nextLine();
     System.out.println("digite a idade");
     idade = ler.nextInt();
     System.out.println("digite sua altura");
     altura = ler.nextDouble();
     
    ler.nextLine();
    
    System.out.println("digite seu endereco");
     endereco = ler.nextLine();
     System.out.println("fim do programa");
     fim = ler.nextLine();
     
     
     
     }
    
}
