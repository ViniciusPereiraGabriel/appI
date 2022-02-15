
package exemplos;

import java.util.Scanner;

public class a2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int numero = 0;
        
        int valor;
        
        do{
            System.out.println("Digite um número");
            valor = teclado.nextInt();
            numero = numero + valor;
            System.out.println("valor da soma dos números digitados é igual a " + numero);
        }while(numero < 500);
    }
    
}
