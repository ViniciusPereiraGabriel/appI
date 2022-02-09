package atividade3;

import java.util.Scanner;

public class parouimpar {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite o numero");
        int numero = teclado.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println("é par");
        } else {
            System.out.println("é impar");
        }
    }
}
