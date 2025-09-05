public class MainProduto {
    public static void main(String[] args) {
        Produto produto = new Produto("Produto 1", 10.0, 100);
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());
        System.out.println("Quantidade em Estoque: " + produto.getQuantidadeEmEstoque());
    }
}
