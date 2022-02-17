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
public class exemplo6 {
    public static void main (String [] args){
       Scanner  teclado = new Scanner(System.in);
        float quantidadeA, custoA, quantidadeB, custoB,total;
        
        System.out.println("Digite a quantidade do produto A:");
        quantidadeA = teclado.nextFloat();
        System.out.println("Digite o custo do produto A:");
        custoA = teclado.nextFloat();
        System.out.println("Digite a quantidade do produto B:");
        quantidadeB = teclado.nextFloat();
        System.out.println("Digite o custo do produto B:");;
        custoB = teclado.nextFloat();
        total = (float)( (quantidadeA * custoA + quantidadeB * custoB)*1.085);
        System.out.println("O total é = " + total);
    }
    
}
