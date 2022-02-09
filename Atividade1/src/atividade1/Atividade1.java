package atividade1;

import java.util.Scanner;

public class Atividade1 {

    public static void main(String[] args) {
        //scanner
        Scanner teclado = new Scanner(System.in);
        //prints
        System.out.println("Digite o nome do aluno");
        String nomeAluno = teclado.nextLine();
        System.out.println("O nome do aluno é:" + nomeAluno);

        System.out.println("Digite a primeira nota");
        float nota1 = teclado.nextFloat();
        System.out.println("A nota 1 é:" + nota1);

        System.out.println("Digite a segunda nota");
        float nota2 = teclado.nextFloat();
        System.out.println("A nota 2 é:" + nota2);

        System.out.println("Digite a terceira nota");
        float nota3 = teclado.nextFloat();
        System.out.println("A nota 3 é:" + nota3);

        float media = nota1 + nota2 + nota3 / 3;
        System.out.println("A nota media é" + media);
        if (media > 6) {
            System.out.println("Aluno aprovado");
        } else {
            System.out.println("aluno reprovado");
        }
    }

}
