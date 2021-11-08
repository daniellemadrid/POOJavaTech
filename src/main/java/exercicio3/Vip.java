package exercicio3;

public class Vip extends Ingresso {

    private double valorAdicional;

    public Vip(double valorIngresso, double valorAdicional) {
        super(valorIngresso);
        this.valorAdicional = valorAdicional;

    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void vipEadicional() {

        System.out.println("O valor do Ingresso VIP é: " + (getValorIngresso() + getValorAdicional()));
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    @Override
    public void imprimeValor(){
         vipEadicional();
    }


}
