/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulajava;

import java.util.Scanner;


public class atividade2 {
      public static void main (String args[]){
          
          Scanner  teclado = new Scanner(System.in);
          
      float  raio, area;
      
       System.out.println("Digite o valor do raio da area:");
       
      raio = teclado.nextFloat();
      area = (float)(2 * 3.14 *raio *raio);
      
      System.out.println("O valor da area é = " +area);
          
          
      }
    
}
