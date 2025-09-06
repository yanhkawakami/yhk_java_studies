class Livro {
    public String titulo;
    private String autor;
    protected int anoPublicacao;
    double preco;

    public Livro() {
        this.titulo = "Desconhecido";
        this.autor = "Desconhecido";
        this.anoPublicacao = 0;
        this.preco = 0.0;
    }

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = 0;
        this.preco = 0.0;
    }

    public Livro(String titulo, String autor, int anoPublicacao, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.preco = preco;
    }

}


public class AplicacaoLivro {

    public static void main(String[] args) {
        Livro livro1 = new Livro();
        Livro livro2 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        Livro livro3 = new Livro("1984", "George Orwell", 1949, 29.90);

        System.out.println("Livro 1: " + livro1.titulo);
        // System.out.println("Autor do Livro 1: " + livro1.autor); // Erro: autor é private
        System.out.println("Ano de Publicação do Livro 1: " + livro1.anoPublicacao);
        System.out.println("Preço do Livro 1: " + livro1.preco);

        System.out.println("Livro 2: " + livro2.titulo);
        // System.out.println("Autor do Livro 2: " + livro2.autor); // Erro: autor é private
        System.out.println("Ano de Publicação do Livro 2: " + livro2.anoPublicacao);
        System.out.println("Preço do Livro 2: " + livro2.preco);

        System.out.println("Livro 3: " + livro3.titulo);
        // System.out.println("Autor do Livro 3: " + livro3.autor); // Erro: autor é private
        System.out.println("Ano de Publicação do Livro 3: " + livro3.anoPublicacao);
        System.out.println("Preço do Livro 3: " + livro3.preco);
    }
}
