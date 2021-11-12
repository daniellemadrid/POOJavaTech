package testeExercicio3;

import exercicio3.*;
import org.junit.Test;

import java.util.Scanner;

public class TesteIngresso {

    @Test
    public void deveriaMostrarOsValoresDoIngresso() {
        Ingresso ingresso = new Ingresso(100);
        Vip vip = new Vip(150.00, 150.00);
        Normal normal = new Normal(20.00);
        CamaroteSuperior camaroteSuperior = new CamaroteSuperior(300, 200, 350);
        CamaroteInferior camaroteInferior = new CamaroteInferior(250, 100, "mesa c");

        System.out.println(" ingresso");
        ingresso.imprimeValor();
        System.out.println("vip");
        vip.imprimeValor();
        System.out.println("normal");
        normal.imprimeValor();
        System.out.println("camarote inferior");
        camaroteInferior.imprimeValor();
        System.out.println("camarote superior");
        camaroteSuperior.imprimeValor();
    }


}

