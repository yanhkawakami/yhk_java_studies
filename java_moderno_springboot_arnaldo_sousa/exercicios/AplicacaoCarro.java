public class AplicacaoCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro("Toyota", "Corolla");
        Carro carro3 = new Carro("Honda", "Civic", 2020);

        Carro.exibirDetalhes(carro1);
        Carro.exibirDetalhes(carro2);
        Carro.exibirDetalhes(carro3);
    }
}