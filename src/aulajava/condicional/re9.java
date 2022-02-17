/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulajava.condicional;

/**
 *
 * @author QI
 */
public class re9 {
     public static void main(String[] args) {
        int contador = 0;
        int multiplicador = 1;
        
        while(multiplicador <=10){
            System.out.println("Tabuada de " + multiplicador + " :");
              while(contador <=10){
                  System.out.println("multiplicador * contador");
                  System.out.println("");
                 contador++;
              }
              System.out.println();
              multiplicador++;
              contador =0;
        }
    }
}
