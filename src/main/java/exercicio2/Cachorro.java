package exercicio2;

public class Cachorro extends Animal {

    private String latir = "auau";

    public Cachorro(String nome, String raca) {
        super(nome, raca);
        this.latir = latir;
    }

    public String getLatir() {
        return latir;
    }

    @Override
    public void exibeDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Raça: " + getRaca());
        System.out.println("O cachorro faz: " + getLatir());

    }
}