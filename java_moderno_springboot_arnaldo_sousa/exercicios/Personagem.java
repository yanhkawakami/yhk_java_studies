public class Personagem {
    public String nome;
    public int nivelDePoder;

    Personagem(String nome, int nivelDePoder) {
        this.nome = nome;
        this.nivelDePoder = nivelDePoder;
    }

    public void tentarAumentarNivelDePoder(int incremento) {
        if (incremento > 0) {
            this.nivelDePoder += incremento;
        }
    }

    public void mudarNome(Personagem personagem, String novoNome) {
        personagem.nome = novoNome;
    }

    public void mudarNivelDePoder(Personagem personagem, int novoNivel) {
        if (novoNivel >= 0) {
            personagem.nivelDePoder = novoNivel;
        }
    }

    public static void main(String[] args) {
        Personagem personagem = new Personagem("Goku", 9001);
        System.out.println("Nome: " + personagem.nome + ", Nível de Poder: " + personagem.nivelDePoder);
        personagem.tentarAumentarNivelDePoder(100);
        System.out.println("Nome: " + personagem.nome + ", Nível de Poder após aumento: " + personagem.nivelDePoder);
        personagem.mudarNome(personagem, "Vegeta");
        System.out.println("Nome após alteração: " + personagem.nome + ", Nível de Poder: " + personagem.nivelDePoder);
        personagem.mudarNivelDePoder(personagem, 8500);
        System.out.println("Nome: " + personagem.nome + ", Nível de Poder após alteração: " + personagem.nivelDePoder);
    }
}
