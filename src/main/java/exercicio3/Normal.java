package exercicio3;

public class Normal extends Ingresso{


    public Normal (double valorIngresso){
        super(valorIngresso);
    }

    public void valorNormal() {
        System.out.println("Ingresso normal");
    }

    @Override
    public void imprimeValor() {
        valorNormal();
        super.imprimeValor();
    }
}
