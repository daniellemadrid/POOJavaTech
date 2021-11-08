package exercicio4;

public class Imovel {
    private String endereco;
    private double preco;


    public Imovel(String endereco, double preco) {
        this.endereco = endereco;
        this.preco = preco;
    }

    public String getEndereco() {
        return endereco;
    }

    public double getPreco() {
        return preco;
    }

    public void exibirDados() {
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Preço: " + getPreco());
    }
}
