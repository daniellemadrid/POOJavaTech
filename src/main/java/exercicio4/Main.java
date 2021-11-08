package exercicio4;

public class Main {
    public static void main(String[] args) {
        Imovel imovel = new Imovel("Rua Andradas", 100000);
        Novo novo = new Novo("Avenida Bento Gonçalves", 300000, 5000);
        Velho velho = new Velho("Sol Nascente", 150000, 30000);

        System.out.println("---Imóvel---");
        imovel.exibirDados();
        System.out.println("-----novo----");
        novo.exibirDados();
        System.out.println("----velho----");
        velho.exibirDados();
    }
}
