package estruturaRepeticao;

import java.util.Scanner;

public class re8 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um valor");
        int valor = teclado.nextInt();
        System.out.println(valor);
        while (valor <= 100) {
            valor = valor + 3;
            System.out.println(valor);
        }
    }
}
