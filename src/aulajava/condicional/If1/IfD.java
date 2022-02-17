/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulajava.condicional.If1;

/**
 *
 * @author QI
 */
public class IfD {
     public static void main (String [] args){
         int estoque =50;
         
         if(estoque >=100){
              System.out.println("Produto com quantidade suficiente");
                      
             
         }else if (estoque < 100 && estoque > 50){
             System.out.println("Alerta:avaliar possibilidade de pedido");
         }else{
             System.out.println("Atenção:faça um pedido");
         }
         
     }
    
}
