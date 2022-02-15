/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplos;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author QI
 */
public class array4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] valores = new int [7];
        
        for(int i = 0; i < 7; i++){
            System.out.printf("Digite o valor da posição[%d] : ", i + 1);
            valores[i] = in.nextInt();
        }
        
        System.out.println(Arrays.toString(valores));
    }
    
}
