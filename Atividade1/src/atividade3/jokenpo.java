
package atividade3;

import java.util.Random;
import java.util.Scanner;

public class jokenpo {
    public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escolha entre pedra, papel e tesoura.");
		System.out.println("1 = pedra");
		System.out.println("2 = papel");
		System.out.println("3 = tesoura");
		int pessoa = teclado.nextInt();
		teclado.close();
		Random random = new Random();
		int ia = random.nextInt(3) + 1;

		System.out.printf("O usuario escolheu %s", pessoa);
		System.out.println("");
		System.out.printf("O CPU escolheu %s", ia);
		System.out.println("");

		if (ia == 1 & pessoa == 1) {
			System.out.println("empate");
		} else if (ia == 2 & pessoa == 2) {
			System.out.println("empate");
		} else if (ia == 3 & pessoa == 3) {
			System.out.println("empate");
		} else if (ia == 1 & pessoa == 2) {
			System.out.println("Você ganhou");
		} else if (ia == 1 & pessoa == 3) {
			System.out.println("Ia ganhou");
		} else if (ia == 2 & pessoa == 1) {
			System.out.println("Ia ganhou");
		} else if (ia == 2 & pessoa == 3) {
			System.out.println("Você ganhou");
		} else if (ia == 3 & pessoa == 1) {
			System.out.println("Você ganhou");
		} else if (ia == 3 & pessoa == 2) {
			System.out.println("Ia ganhou");
		} else {
			System.out.println("alguem digitou algo errado, eu imagino que tenha sido você.");
		}

	}
}
