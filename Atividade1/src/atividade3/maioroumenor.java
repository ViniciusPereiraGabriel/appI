package atividade3;

import java.util.Scanner;

public class maioroumenor {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite o primeiro numero");
        int numero = teclado.nextInt();
        System.out.println("digite o segundo numero");
        int numero2 = teclado.nextInt();

        if (numero > numero2) {
            System.out.println("é maior");
        } else if (numero == numero2) {
            System.out.println("é igual");
        } else {
            System.out.println("é menor");
        }
    }
}
