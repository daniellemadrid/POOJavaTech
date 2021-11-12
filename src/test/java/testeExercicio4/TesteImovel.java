package testeExercicio4;

import exercicio4.Imovel;
import exercicio4.Novo;
import exercicio4.Velho;
import org.junit.Test;

import java.util.Scanner;

public class TesteImovel {

    @Test
    public void deveriaMostrarOsDadosDoImovell() {
        Imovel imovel = new Imovel("Rua Andradas", 100000);
        Novo novo = new Novo("Avenida Bento Gonçalves", 300000, 5000);
        Velho velho = new Velho("Sol Nascente", 150000, 30000);

        System.out.println(" imovel");
        imovel.exibirDados();
        System.out.println("imovel novo");
        novo.exibirDados();
        System.out.println("imovel velho");
        velho.exibirDados();

    }
}

