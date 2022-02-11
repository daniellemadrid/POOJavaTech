package exercicio6;

public class Onibus extends Veiculo {
    private int assentos;

    public Onibus(String placa, int ano, int assentos) {
        super(placa, ano);
        this.assentos = assentos;
    }

    public int getAssentos() {
        return assentos;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    @Override
    public void exibirDados() {
        System.out.println("A placa do ônibus é: " + getPlaca() + " seu ano é: " + getAno() + " e tem " + getAssentos() + " assentos!");
    }
}
