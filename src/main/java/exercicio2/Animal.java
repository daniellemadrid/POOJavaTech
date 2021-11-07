package exercicio2;

public class Animal {

    private String nome;
    private String raca;

    public Animal(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public String caminhar() {
        return ("Estou caminhando!");
    }

    public void exibeDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Raça: " + getRaca());
    }
}
