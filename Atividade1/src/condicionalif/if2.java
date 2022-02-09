package condicionalif;

public class if2 {

    public static void main(String[] args) {
        double nota1 = 10.00;
        double nota2 = 10.00;

        boolean maior = nota1 > nota2;

        System.out.println("Maior " + maior);
        boolean maiorigual = nota1 >= nota2;

        System.out.println("maior ou igaul " + maiorigual);
        boolean igual = nota1 == nota2;

        System.out.println("igual " +igual);
        boolean menor = nota1 < nota2;
        
        System.out.println("menor "+menor);
        boolean menorigual = nota1 <= nota2;
        
        System.out.println("menor ou igual "+menorigual);
        boolean diferente = nota1 != nota2;
        
        System.out.println("diferente "+diferente);
        
    }
}
