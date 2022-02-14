package estruturaRepeticao;

import java.util.Scanner;

public class re7 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int pessoa, media, idade;
        idade = 1;
        pessoa = 0;
        media = 0;

        while (idade != 0) {
            System.out.println("digite a idade da pessoa");
            idade = teclado.nextInt();

            if (idade != 0) {
                pessoa = pessoa + 1;

                media = media + idade;

            }
        }
        media = media / pessoa;
        System.out.println("O numero de pessoas que foram lidas suas idades é igual a " +pessoa);
        System.out.println("A idade media do grupo é "+media);
    }
}
