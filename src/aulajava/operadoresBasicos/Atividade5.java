/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulajava.operadoresBasicos;

import java.util.Scanner;


public class Atividade5 { 
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
       double a, b, resultado;
       
        System.out.println("Digite o primeiro numero");
        a = ler.nextDouble();
        
        System.out.println("Digite o segundo numero");
        b = ler.nextDouble();
        
        resultado = a + b;
        
        System.out.println("Soma" +resultado);
        
        resultado = a - b;
        System.out.println("Diferença" +resultado);
        
        resultado = a * b;
        System.out.println("Multiplica" +resultado);
        
        resultado = a / b;
        System.out.println("Dividir" +resultado);
        
    }
}

        
        
    
    

