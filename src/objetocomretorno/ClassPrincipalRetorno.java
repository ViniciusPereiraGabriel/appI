package objetocomretorno;

/**
 *
 * @author QI
 */
public class ClassPrincipalRetorno {

    public static void main(String[] args) {

        PessoaA ca = new PessoaA();

        ca.setNome("João");
        ca.setIdade(42);

        System.out.println("nome: " + ca.getNome());
        System.out.println("idade: " + ca.getIdade());

        System.out.println(ca.getIdade());
        System.out.println(ca.getNome());
    }

}
