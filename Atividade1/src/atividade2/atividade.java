package atividade2;

import java.util.Scanner;

public class atividade {

    public static void main(String[] args) {
        System.out.println("Pergutas: ");
        System.out.println("O que é algoritimo?");
        System.out.println("é como uma receita de códigos");
        System.out.println("////////////////////");
        System.out.println("algoritimo de criação de macarrão instantaneo");
        System.out.println("Pegue uma panela");
        System.out.println("Coloque agua");
        System.out.println("coloque o fogo no medio");
        System.out.println("coloque a agua para esquentar e espere");
        System.out.println("Ao ferver coloque o macarrão e a metade do tempero");
        System.out.println("espere 5 a 10 minutos e tire a agua da panela segurando o macarrão com um garfo ou com algum utensilho de sua preferencia");
        System.out.println("pegue um prato e coloque o macarrão");
        System.out.println("Coloque o resto do tempero e misture");
        System.out.println("agora curta seu macarrão e pense na sua saude, macarrão instantaneo é pura fritura");
        System.out.println("////////////////////////");
        System.out.println("o bolo é de que?");
        System.out.println("O bolo é de chocolate");
        System.out.println("quanto custa?");
        System.out.println("Cada fatia é 5 reais");
        System.out.println("posso comprar as 18 horas?");
        System.out.println("somente das 14 as 17 horas");
        System.out.println("como faço para comprar?");
        System.out.println("entre em contato pelo 9999-9999");
        System.out.println("/////////////////////");

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        double num1 = teclado.nextDouble();

        System.out.println("Digite o segundo número");
        double num2 = teclado.nextDouble();

        double soma = num1 + num2;
        double subtracao = num1 - num2;
        double divisao = num1 / num2;
        double multiplicacao = num1 * num2;

        System.out.println("Escolha a operação digitando 1,2,3 ou 4");
        System.out.println("1 soma");
        System.out.println("2 subtração");
        System.out.println("3 divisão");
        System.out.println("4 multiplicação");

        int escolha = teclado.nextInt();

        if (escolha == 1) {
            System.out.println("a soma deu:" + soma);
        }
        if (escolha == 2) {
            System.out.println("a subtração deu:" + subtracao);
        }
        if (escolha == 3) {
            System.out.println("a divisão deu:" + divisao);
        }
        if (escolha == 4) {
            System.out.println("a multiplicação deu:" + multiplicacao);
        }
    }

}
