package exercicio2;

public class Pobre extends Rica{
    private String trabalho;

    public Pobre(String nome, int idade, double dinheiro, String compras, String trabalho) {

        super(nome, idade, dinheiro, compras);
        this.trabalho = trabalho;
    }
    public String getTrabalho(){
        return trabalho;
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
