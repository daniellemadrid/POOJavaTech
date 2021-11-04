public class Administrativo extends Assistente {

    private double bonusNoturno = 200;
    private String turno = "dia";

    public double getBonus(double salario){
        return bonusNoturno + salario;
    }
    public Administrativo(String nome, String cpf, double salario, int matricula, String turno){
        super(nome,cpf,salario, matricula);
        this.turno = turno;

        if(turno == "noite") {
            setSalario(salario + bonusNoturno);
        }
    }
}

