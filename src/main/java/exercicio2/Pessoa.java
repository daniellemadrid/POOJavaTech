package exercicio2;

public class Pessoa {

    private String nome;
    private int idade;


    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void exibeDados() {
        System.out.println("O nome é: " + getNome());
        System.out.println("A idade é: " + getIdade());

    }

}
