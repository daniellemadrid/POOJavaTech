package exercicio2;

public class Miseravel extends Pobre {

    private String mendiga;

    public Miseravel(String nome, int idade, double dinheiro, String compras, String trabalho,  String mendiga) {
        super(nome, idade, dinheiro, compras, trabalho);
        this.mendiga = mendiga;
    }

    public String getMendiga(){
        return mendiga;
    }

    @Override
    public void exibeDados() {
        System.out.println("O nome é: " + getNome());
        System.out.println("A idade é: " + getIdade());
        System.out.println("Você tem dinheiro? " + getDinheiro());
        System.out.println("Você comprou: " + getCompras());
        System.out.println("Você trabalha? " + getTrabalho());


    }
}
