package estruturaRepeticao;

import java.util.Scanner;

public class re12 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao = 0;
        float valor1, valor2, resultado;
        resultado = 0;

        do {
            System.out.println("0 sair");
            System.out.println("1 para somar");
            System.out.println("2 para subtrair");
            System.out.println("3 para multiplicar");
            System.out.println("4 para dividir");
            System.out.println("digite o cóigo da operação deseajada");

            opcao = teclado.nextInt();
            if (opcao != 0) {
                System.out.println("Digite o primeiro valor");
                valor1 = teclado.nextFloat();
                System.out.println("Digite o segundo valor");
                valor2 = teclado.nextFloat();
            }
            if (opcao == 1) {
                resultado = valor1 + valor2;
            } else if (opcao == 2) {
                resultado = valor1 - valor2;
            } else if (opcao == 3) {
                resultado = valor1 * valor2;
            } else if (opcao == 4) {
                resultado = valor1 / valor2;
                System.out.println("O resultado é " + resultado);
            }
        } while (opcao != 0);
    }
}
