package atividade1;

import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       float raio;
       float area;
       
        System.out.println("Digite o valor do raio");
        raio = teclado.nextFloat();
        
        area = (float)(2 * 3.14 *raio *raio);
        System.out.println("A área é " + area);
    }
}
