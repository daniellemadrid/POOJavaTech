package exercicio1;

public class Tecnico extends Assistente {

    private double bonus = 100;


    public double getBonus(double salario) {
        return bonus + salario;
    }

    public Tecnico(String nome, String cpf, double salario, int matricula) {
        super(nome, cpf, salario, matricula);
        setSalario(salario + bonus);
    }
}

