package exercicio3;

public class Ingresso {

    private double valorIngresso;

    public Ingresso(double valorIngresso) {
        this.valorIngresso = valorIngresso;
    }

    public double getValorIngresso() {
        return valorIngresso;
    }


    public void imprimeValor() {

        System.out.println("O valor do ingresso é: " + getValorIngresso());
    }




}
