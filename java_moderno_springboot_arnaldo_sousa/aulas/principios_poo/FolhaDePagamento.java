import empresa.dados.*;

public class FolhaDePagamento {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Ana", 3000);
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salário: " + funcionario.getSalario());
        funcionario.aumentarSalario(20);
        System.out.println("Salário após aumento: " + funcionario.getSalario());
        funcionario.alterarSalario(10000);
        System.out.println("Salário após alteração: " + funcionario.getSalario());
    }
}