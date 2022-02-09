package condicionalif;

import java.util.Scanner;

public class if6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite um ano");
        int ano = teclado.nextInt();
        
        if ((ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println("ano bissexto");
        } else {
            System.out.println("ano comum");
        }
    }
}
