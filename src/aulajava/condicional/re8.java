
package aulajava.condicional;

import java.util.Scanner;


 
public class re8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       
      int valor;
      
    System.out.println("Digite um valor");
    valor = teclado.nextInt();
    
    System.out.println(valor);
    
    while(valor <= 100){
        valor = valor + 3;
        System.out.println(valor);
    }
    }
}
