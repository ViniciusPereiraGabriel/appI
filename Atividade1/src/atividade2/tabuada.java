
package atividade2;

import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite um numero");
        int numero = teclado.nextInt();
        
        System.out.println(numero * 1);
        System.out.println(numero * 2);
        System.out.println(numero * 3);
        System.out.println(numero * 4);
        System.out.println(numero * 5);
        System.out.println(numero * 6);
        System.out.println(numero * 7);
        System.out.println(numero * 8);
        System.out.println(numero * 9);
        System.out.println(numero * 10);
        
        System.out.println("Caso deseja um número especifico, digite-o");
        
        int numero2 = teclado.nextInt();
        
        System.out.println(numero * numero2);
    }
}
