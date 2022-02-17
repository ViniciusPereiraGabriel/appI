package orientacaoObjetoComRetorno;

public class Pessoa {

    private String nome;
    private Integer idade;

    //metodo construtor
    //get imprime
    public String getNome() {
        return nome;
    }

    //set altera
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    //metodo com retorno

    public String retornaNome() {//retorna o texto do nome da pessoa
        return getNome(/*sem parametro*/);
    }

    public int retornaIdade(){
        return getIdade(/*sem parametro*/);
    }
    
    
}
