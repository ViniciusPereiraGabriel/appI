/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientacaoObjeto;

/**
 *
 * @author QI
 */
public class testa_humano {
    public static void main(String[] args) {
        Humano paulo = new Humano();
        Humano pedro = new Humano();
        Humano thiago = new Humano();
        
        paulo.CorDaPele = "moreno";
        paulo.CorDosOlhos = "verde";
        paulo.altura = 1.80; 
        paulo.idade = 34;
        paulo.nome = "Paulo Pereira";
        paulo.peso = 84.50;
        paulo.religiao = "catolica";
        paulo.sexo = "masculino";
        
        System.out.println(paulo.nome + " "+ paulo.estadocivil+ " " + paulo.religiao);
        
        
    pedro.CorDaPele = "branco";
        pedro.CorDosOlhos = "azul";
        pedro.altura = 1.80; 
        pedro.idade = 34;
        pedro.nome = "Pedro Manuel";
        pedro.peso = 84.50;
        pedro.religião = "catolica";
        pedro.sexo = "masculino";
        
        
    }
    
}
