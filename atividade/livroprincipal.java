package atividade;

import java.util.Scanner;

public class livroprincipal {

    public static void main(String[] args) {

        Livro livros = new Livro();
        livros.calculodesconto();
        Scanner teclado = new Scanner(System.in);

        System.out.println("digite o titulo");
        livros.setTitulo(teclado.next());
        
        System.out.println("digite o nome do autor");
        livros.setAutor(teclado.next());
        
        System.out.println("digite o genero");
        livros.setGenero(teclado.next());
        
        System.out.println("digite o ano");
        livros.setAno(teclado.nextInt());
        
        System.out.println("digite o preço");
        livros.setPreco(teclado.nextFloat());
        
        System.out.println("Seu valor final com desconto é: ");
    }
}
