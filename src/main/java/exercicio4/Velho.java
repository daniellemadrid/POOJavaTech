package exercicio4;

public class Velho extends Imovel{
    private double desconto;

    public Velho(String endereco, double preco, double desconto) {
        super(endereco, preco);
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }

    public void desconto() {
        System.out.println("Desconto do imóvel velho: " + getDesconto());
        System.out.println("Valor total: " + (getPreco() - getDesconto()));
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        desconto();
    }
}
