package exercicio4;

public class Novo extends Imovel{
    private double valorAdicional;

    public Novo( String endereco, double preco, double valorAdicional) {
        super(endereco, preco);
        this.valorAdicional = valorAdicional;
    }
    public double getValorAdicional() {
        return valorAdicional;
    }

    public void valorAdicional() {
        System.out.println("Valor adicional do imóvel novo: " + getValorAdicional());
        System.out.println("Valor total: " + (getPreco() + getValorAdicional()));
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        valorAdicional();
    }

}
