package objetocomretorno;

public class Cliente {

    private String nome;
    private String estado_civil;
    private double rendimento;
    private String telefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    //metodo com retorno

    public double calcularRendimento() {
        this.rendimento = 10;
        double resposta = (this.rendimento * 10);
        return resposta;

    }
}
