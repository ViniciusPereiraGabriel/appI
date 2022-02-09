package atividade3;

import java.util.Scanner;

public class positivonegativo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("escolha um numero");
        int numero = teclado.nextInt();

        if (numero == 0) {
            System.out.println("neutro");
        }
        else if (numero >= 1) {
            System.out.println("positivo");
        }
        else if (numero <= -1) {
            System.out.println("negativo");
        } else {
            System.out.println("numero n coomprendido");
        }
    }
}
