/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientacaoObjeto;

/**
 *
 * @author QI
 */
public class TestaPessoa {
    public static void main(String[] args) {
        Pessoa guilherme = new Pessoa();
        Pessoa nicole = new Pessoa();
        Pessoa gustavo = new Pessoa();    
        
        guilherme.nome = "Guilherme";
        guilherme.idade = 18;
        guilherme.identidade = "2324272829";
        guilherme.telefone = "91248482";
        
        System.out.println(guilherme.nome + guilherme.indentidade);
        
        nicole.nome = "Nicole";
        nicole.idade = 21;
        nicole.identidade = "121125454";
        nicole.telefone = "549989855654";
        
                
        System.out.println(nicole.nome + nicole.idade);
        
        
        gustavo.nome = "Gustavo";
        gustavo.idade = 35;
        gustavo.identidade = "154545466156";
        gustavo.telefone = "91248482";
        
             System.out.println(gustavo.nome + gustavo.idade+ gustavo.identidade);
             
                
        
                
    }
}
