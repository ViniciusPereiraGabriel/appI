
package aulajava.condicional;

import javax.swing.JOptionPane;


public class re10 {

    public static void main(String[] args) {
        int numero;
        String concatena ="";
        int numerodigitado;

        int soma = 0;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Qual é a quantidade de nuemros que deseja somar"));

        int x = 1;

        while (x <= numero) {
            numerodigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite o" + x + "numero"));
            concatena = concatena + numerodigitado+ ",";
            soma = soma + numerodigitado;
            ++x;

        }
        JOptionPane.showMessageDialog(null, "Os numeros digitados foram:" + concatena + " \n O valor da soma é:" + soma);
    }

}
