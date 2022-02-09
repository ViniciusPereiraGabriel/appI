package condicionalif;

public class if1 {

    public static void main(String[] args) {
        int valorA = 7;
        int valorB = 7;

        if (valorA > valorB) {
            System.out.println("é maior");
        }
        if (valorA >= valorB) {
            System.out.println("é maior ou igual");
        }
        if (valorA < valorB) {
            System.out.println("é menor");
        }
        if (valorA <= valorB) {
            System.out.println("é menor ou igual");
        }
        if (valorA == valorB) {
            System.out.println("é igual");
        }
        if (valorA != valorB) {
            System.out.println("é diferente");
        } else {
            System.out.println("sei lá");
        }
    }
}
