package testeExercicio3;

import exercicio3.*;

import java.util.Scanner;

public class TesteIngresso {

    public static void main(String[] args) {
        Ingresso ingresso = new Ingresso(100);
        Vip vip = new Vip(150.00, 150.00);
        Normal normal = new Normal(20.00);
        CamaroteSuperior camaroteSuperior = new CamaroteSuperior(300, 200, 350);
        CamaroteInferior camaroteInferior = new CamaroteInferior(250, 100, "mesa c");

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite 1 para ingresso normal e 2 para ingresso Vip: ");
        int num = entrada.nextInt();
        switch (num) {
            case 1:
                System.out.println("----- Normal ----");
                normal.imprimeValor();
                break;
            case 2:
                System.out.println("Você escolheu vip, digite 1 para Camarote Inferior e 2 para Camarote Superior");
                int num2 = entrada.nextInt();

                switch (num2) {
                    case 1:
                        camaroteInferior.imprimeValor();
                        break;
                    case 2:
                        camaroteSuperior.imprimeValor();
                        break;
                    default:
                        System.out.println("Número Inválido!");
                }
        }


    }
}
