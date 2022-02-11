package testeExercicio6;

import exercicio6.Caminhao;
import exercicio6.Onibus;
import exercicio6.Veiculo;

import java.util.ArrayList;

public class VeiculosTeste {

    public static void main(String[] args) {

        Veiculo veiculo = new Veiculo("ABC-0987", 2012);
        Caminhao caminhao = new Caminhao("QWE-8900", 2006, 5);
        Onibus onibus = new Onibus("TGH-0087", 2010, 30);

        System.out.println("Veículo");
        veiculo.exibirDados();
        System.out.println("Caminhão");
        caminhao.exibirDados();
        System.out.println("Ônibus");
        onibus.exibirDados();

    }
}
