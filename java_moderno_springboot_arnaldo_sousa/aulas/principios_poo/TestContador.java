class Contador {
    static int contagem = 0;

    public Contador() {
        contagem++;
    }

}

public class TestContador {
    public static void main(String[] args) {
        // Nesse caso, a variável contagem é compartilhada entre todas as instâncias da classe Contador, pois
        // é declarada como estática, então pertence à classe.
        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();

        System.out.println("Total de objetos Contador: " + Contador.contagem);
    }
}
