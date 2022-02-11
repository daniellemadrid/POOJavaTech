package exercicio6;

public class Caminhao extends Veiculo {
    private int eixos = 10;

    public Caminhao(String placa, int ano, int eixos) {
        super(placa, ano);
        this.eixos = eixos;
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    @Override
    public void exibirDados() {
        System.out.println("A placa do caminhão é: " + getPlaca() + " seu ano é: " + getAno() + " e tem " + getEixos() + " eixos!");

    }
}
