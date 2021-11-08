package testeExercicio3;

import exercicio3.CamaroteSuperior;
import exercicio3.Ingresso;
import exercicio3.Normal;
import exercicio3.Vip;

public class TesteIngresso {

    public static void main(String[] args){
        Ingresso ingresso = new Ingresso(100);
        Vip vip = new Vip(150.00, 150.00);
        Normal normal = new Normal(20.00);
        CamaroteSuperior camaroteSuperior = new CamaroteSuperior(150, 200, 350);

        System.out.println("----- Valores Ingresso -----");
        ingresso.imprimeValor();
        System.out.println("---- Valor Vip ----");
        vip.imprimeValor();
        System.out.println("----- Normal ----");
        normal.imprimeValor();
        System.out.println("----- Camarote Superior ----");
        camaroteSuperior.imprimeValor();
    }
}
