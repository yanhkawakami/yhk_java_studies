public class Bolo {

    int quantidadeDeAcucar; // Toda variável primitiva numérica é inicializada por zero, caso nenhum valor seja atribuído

    public static void main (String[] args) {
        Bolo boloDeChocolate = new Bolo();
        boloDeChocolate.quantidadeDeAcucar = 200;

        Bolo boloDeBaunilha = new Bolo();
        boloDeBaunilha.quantidadeDeAcucar = 200;

        System.out.println("Bolo de Chocolate tem " 
            + boloDeChocolate.quantidadeDeAcucar + " colheres de açúcar.");
        System.out.println("Bolo de Baunilha tem " 
            + boloDeBaunilha.quantidadeDeAcucar + " colheres de açúcar.");
    }
}