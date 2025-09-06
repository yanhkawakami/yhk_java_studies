class Pessoa {
    public String nome;
    private int idade;
    protected String endereco;
    int telefone;

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setEndereco(String endereco) {
        // Por mais que seja privado, o atributo pode ser acessado dentro da classe
        this.endereco = endereco;
    }

    public String getEndereco() {
        // Por mais que seja privado, o atributo pode ser acessado dentro da classe
        return this.endereco;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getTelefone() {
        return this.telefone;
    }

}

public class AplicacaoPessoa {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "João";
        pessoa.setIdade(30);
        pessoa.setEndereco("Rua A, 123");
        pessoa.setTelefone(123456789);

        System.out.println("Nome: " + pessoa.nome);
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Endereço: " + pessoa.getEndereco());
        System.out.println("Telefone: " + pessoa.getTelefone());
    }
}