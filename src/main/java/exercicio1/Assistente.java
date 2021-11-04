package exercicio1;

public class Assistente extends Funcionario {

    private int matricula;

    public Assistente(String nome, String cpf, double salario, int matricula) {

        super(nome, cpf, salario);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }


    @Override
    public void exibeDados() {
        System.out.println("Matrícula: " + getMatricula());
        System.out.println("Nome: " + getNome());
        System.out.println("Cpf: " + getCpf());
        System.out.println("Salário: " + getSalario());

    }
}

