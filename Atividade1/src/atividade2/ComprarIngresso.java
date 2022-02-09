package atividade2;

import java.util.Scanner;

public class ComprarIngresso {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome = teclado.next();
        System.out.println("Digite a quantidade de ingressos que deseja");
        System.out.println("O valor do ingresso está a R$25,00");
        int valor = 25;
        int ingresso = teclado.nextInt();

        int quantidade = valor * ingresso;

        if (ingresso >= 1) {
            System.out.printf("%s, seus %s ingressos deram o valor de: R$%s \n", nome, ingresso, quantidade);
            System.out.println("Concluir a compra? S/N");
        } else {
            System.out.println("valor não aceito");
        }

        char sn = teclado.next().charAt(0);

        switch (sn) {
            case 'S' ->
                System.out.println("Compra efetuada com sucesso");
            case 'N' ->
                System.out.println("Compra cancelada");
            case 's' ->
                System.out.println("Compra efetuada com sucesso");
            case 'n' ->
                System.out.println("Compra cancelada");
            default ->
                System.out.println("Valor não encontrado, cancelando...");
        }
    }
}
