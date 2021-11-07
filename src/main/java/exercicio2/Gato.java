package exercicio2;

public class Gato extends Animal {

    private String miar = "miaumiau";
    public Gato(String nome, String raca) {
        super(nome, raca);
        this.miar = miar;

    }
    public String getMiar() {
        return miar;
    }
    @Override
    public void exibeDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Raça: " + getRaca());
        System.out.println("O gato faz: " + getMiar());

    }
}
