public class Carro {
    String marcaDoCarro;
    String modeloDoCarro;
    int anoDoCarro;

    Carro () {
        this.marcaDoCarro = "Desconhecida";
        this.modeloDoCarro = "Desconhecido";
        this.anoDoCarro = 0;
    }

    Carro (String marcaDoCarro, String modeloDoCarro) {
        this.marcaDoCarro = marcaDoCarro;
        this.modeloDoCarro = modeloDoCarro;
        this.anoDoCarro = 0;
    }

    Carro (String marcaDoCarro, String modeloDoCarro, int anoDoCarro) {
        this.marcaDoCarro = marcaDoCarro;
        this.modeloDoCarro = modeloDoCarro;
        this.anoDoCarro = anoDoCarro;
    }

    public static void exibirDetalhes(Carro carro) {
        System.out.println("Marca: " + carro.marcaDoCarro);
        System.out.println("Modelo: " + carro.modeloDoCarro);
        System.out.println("Ano: " + carro.anoDoCarro + "\n");
    }

}
