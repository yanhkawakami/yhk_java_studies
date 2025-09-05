class SalaDeAula {

    static int contagem_alunos = 0;

    public static void adicionarAluno() {
        contagem_alunos++;
    }

    static void exibirContagemAlunos() {
        System.out.println("Total de alunos: " + contagem_alunos);
    }
}

public class TestSalaDeAula {

    public static void main(String[] args) {
        // Criando instâncias de SalaDeAula
        SalaDeAula sala1 = new SalaDeAula();
        SalaDeAula sala2 = new SalaDeAula();
        SalaDeAula sala3 = new SalaDeAula();

        SalaDeAula.adicionarAluno();
        SalaDeAula.adicionarAluno();
        SalaDeAula.adicionarAluno();
    
        SalaDeAula.exibirContagemAlunos();
    }
}

