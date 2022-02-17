5/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

import java.util.Scanner;

/**
 *
 * @author QI
 */
public class ar2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int numero = 0;
         int valor;
         
         do{
             System.out.println("Digite um numero");
             valor = teclado.nextInt();
             numero = numero + valor;
             System.out.println("valor da soma dos numeros digitados é igual a " + numero);
             
         }while (numero < 500);
         
    }
    
}
