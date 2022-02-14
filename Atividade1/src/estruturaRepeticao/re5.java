
package estruturaRepeticao;

import java.util.Scanner;

public class re5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o numero:");
        int aux = teclado.nextInt();
        
        while(aux <= 500){
        if(aux % 2 == 1){
            System.out.println(aux);
        }
        aux++;
        }
    }
}
