/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulajavanoite;

import java.util.Scanner;

/**
 *
 * @author QI
 */
public class aulajavanoite {
     public static void main(String[] args) {
        
         String apresentação; 
         String sabor;
         String valor;
         String hora;
         String local;
         String info;
        
         System.out.println("Oi, meu nome é Paulo, Vou vender bolo de chocolate hoje as 14h ás 17h na entrada da faculdade. Cada fatia é R$5,00. Interessados podem etrar em contato pelo 9999-99999****");
     Scanner ler = new Scanner(System.in);
     System.out.println("Dúvidas?");
      sabor = ler.nextLine();
         System.out.println("o Sabor do bolo sera de chocolate");
         
      System.out.println("Dúvidas?");
     valor = ler.nextInt();
         System.out.println("Custara R$5,00 o pedaço.");
         
     System.out.println("Dúvidas?");
      hora = ler.nextInt();    
         System.out.println("O horário de atendimento será das 14h as 17h"); 
         
         System.out.println("Dúvidas?");
         local = ler.nextLine();
         System.out.println("Estarei na entrada principal da faculdade");
         
         System.out.println("Dú´vidas?");    
        info = ler.nextLine();
         System.out.println("Somente chegar no locar e será atendido");
    }
    
}
