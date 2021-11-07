package exercicio2;

public class Rica extends Pessoa {
    private String compras;
    private double dinheiro;

    public Rica(String nome, int idade, double dinheiro, String compras) {

        super(nome, idade);
        this.compras = compras;
        this.dinheiro = dinheiro;
    }


    public String getCompras(){
        return compras;
    }
    public double getDinheiro(){ return dinheiro;}

    @Override
    public void exibeDados() {
        System.out.println("O nome é: " + getNome());
        System.out.println("A idade é: " + getIdade());
        System.out.println("Você tem dinheiro? " + getDinheiro());
        System.out.println("Você comprou: " + getCompras());

    }
}
