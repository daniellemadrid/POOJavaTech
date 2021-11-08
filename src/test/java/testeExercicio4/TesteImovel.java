package testeExercicio4;

import exercicio4.Imovel;
import exercicio4.Novo;
import exercicio4.Velho;

import java.util.Scanner;

public class TesteImovel {

    public static void main(String[] args) {
        Imovel imovel = new Imovel("Rua Andradas", 100000);
        Novo novo = new Novo("Avenida Bento Gonçalves", 300000, 5000);
        Velho velho = new Velho("Sol Nascente", 150000, 30000);

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite 1 para Imóvel novo e 2 para imóvel velho: ");
        int num = entrada.nextInt();
        switch (num) {
            case 1:
                System.out.println("Imóvel Novo");
                novo.exibirDados();
                break;
            case 2:
                System.out.println("Imóvel Velho");
                velho.exibirDados();
                break;
            default:
                System.out.println("Número Inválido!");

        }
    }
}
