package atividade1;

import java.util.Scanner;

public class Atividade3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite um número");
        int varA = teclado.nextInt();
        int dobro = varA * 2;
        System.out.println("O dobro do número é " +dobro);
        int triplo = varA * 3;
        System.out.println("O triplo do número é " +triplo);
        int metadeDoTriplo = (dobro * 3)/2;
        System.out.println("A metade do triplo do dobro é "+metadeDoTriplo);
        int quintaParte = varA / 5;
        System.out.println("A quinta parte do número é " + quintaParte);
    }

}
