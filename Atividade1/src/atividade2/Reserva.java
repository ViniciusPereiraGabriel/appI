package atividade2;

import java.util.Scanner;

public class Reserva {

    public static void main(String[] args) {
        System.out.println("Digite a matricula do aluno");
        Scanner teclado = new Scanner(System.in);
        int matricula = teclado.nextInt();
        System.out.println("Digite o nome do livro");
        String livro = teclado.next();
        System.out.printf("O livro %s foi reservado na matricula %s com sucesso!\n", livro, matricula);
    }
}
