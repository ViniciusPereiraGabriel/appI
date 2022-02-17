/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientacaoSemRetorno;

/**
 *
 * @author QI
 */
public class Funcionario {

    public String nome;
    public float salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void alterarDados() {
        this.nome = "Carlos";
        this.salario = 1500;
        
        System.out.println(this.nome + " " + this.salario);
    }
    
}
