/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulajava.condicional;

import java.util.Scanner;

/**
 *
 * @author QI
 */
public class re12 {
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       int opcao = 0;
       float valor1, valor2, resultado;
       resultado =0;
       
       do{
           System.out.println("0= sair");
           System.out.println("1= somar");
           System.out.println("2= subtrair");
           System.out.println("3= multiplicar");
           System.out.println("4= dividir");
           System.out.println("Digite o codigo da operação desejada");
        
          if(opcao != 0){
              System.out.println("Digite o numero");
              valor1 = teclado.nextFloat();
              System.out.println("Digite o segundo numero");
              valor2 = teclado.nextFloat();
              if(opcao ==1){
                  resultado =valor1 + valor2;
            }else if (opcao ==2){
               resultado = valor1 - valor2
            }else if (opcao ==3){
               resultado = valor1*valor2
            }else if(opcao ==4)                     
          }
       }
        
    }
    
}
