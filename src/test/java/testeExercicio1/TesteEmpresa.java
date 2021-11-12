package testeExercicio1;

import exercicio1.Administrativo;
import exercicio1.Assistente;
import exercicio1.Funcionario;
import exercicio1.Tecnico;
import org.junit.Test;

import java.util.Scanner;

public class TesteEmpresa {

    @Test
    public void deveriaPassarOsDadosDosFuncionarios() {
        Funcionario funcionario = new Funcionario("Danielle", "229393388", 50.000);
        Assistente assistente = new Assistente("Leonardo", "04499589", 50.0000, 987667878);
        Tecnico tecnico = new Tecnico("Maria", "47474943", 4800.000, 395488749);
        Administrativo administrativo = new Administrativo("Carol", "308884758", 50.000, 943784758, "noite");

        System.out.println("----Funcionário-----");
        funcionario.exibeDados();
        System.out.println("----Assistente----");
        assistente.exibeDados();
        System.out.println("----Técnico----");
        tecnico.exibeDados();
        System.out.println("----Administrativo----");
        administrativo.exibeDados();

    }
}
