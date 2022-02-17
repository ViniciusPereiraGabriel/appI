/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientacaoSemRetorno;

/**
 *
 * @author QI
 */
public class Fornecedor {

    public String nome;
    public String endereco;
    public Integer idade;
    public String identidade;

    public String getNome() {
        return nome;

    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    void listarFornecedor() {

        this.nome = "Roberto";
        this.endereco = "Avenida";
        this.idade = 38;
        this.identidade = "2164556456";

        System.out.println(nome + " " + endereco + " " + idade + " " + identidade);
       
    }

}
