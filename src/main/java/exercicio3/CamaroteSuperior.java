package exercicio3;

public class CamaroteSuperior extends Vip {
    private double valorSuperior;

    public CamaroteSuperior(double valorIngresso, double valorAdicional, double valorSuperior){
        super(valorIngresso, valorAdicional);
        this.valorSuperior = valorSuperior;
    }
    public double getValorSuperior(){
        return valorSuperior;
    }

    public void valorCamarote() {
        System.out.println("Valor do ingresso camarote superior: " + (getValorIngresso() + getValorAdicional() + getValorSuperior()));
    }

    @Override
    public void imprimeValor(){
         valorCamarote();
    }


}
