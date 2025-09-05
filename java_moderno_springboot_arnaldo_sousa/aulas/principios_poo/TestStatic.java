import empresa.dados.*;

// Os membros estáticos pertencem à classe e não a instâncias específicas
// Isso significa que você pode acessar métodos e variáveis estáticas sem criar um objeto da classe.
// Este membro é compartilhado entre todas as instâncias da classe.

public class TestStatic {

    static String nomeDaClasse = "TestStatic";

    public static void exibirValor(int a) {
        System.out.println("O valor do inteiro é: " + a);
    }

    public static void exibirValor(String a) {
        System.out.println("O valor da String é: " + a);
    }

    public static void main(String[] args) {
        // Métodos static podem ser chamados sem criar um objeto da classe;
        // Caso não seja necessário manter o estado, use métodos static.
        TestStatic.exibirValor(10);
        exibirValor(20);
        System.out.println("Nome da classe: " + nomeDaClasse);
        TestStatic.exibirValor("Teste");
        exibirValor("Teste");
    }
}
