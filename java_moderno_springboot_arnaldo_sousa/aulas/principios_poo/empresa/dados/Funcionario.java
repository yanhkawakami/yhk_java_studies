package empresa.dados;

// public: pode ser acessado de qualquer lugar
// private: só pode ser acessado dentro da classe
// protected: pode ser acessado dentro da classe e por classes filhas (subclasses)
// default (sem modificador): pode ser acessado dentro do mesmo pacote


public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void aumentarSalario(double aumento) {
        salario += aumento;
    }

    public void aumentarSalario(int porcentagem){
        if (porcentagem > 0) {
            salario += salario * porcentagem / 100;
        }
    }

    public void alterarSalario(double novoSalario) {
        salario = novoSalario;
    }

}

