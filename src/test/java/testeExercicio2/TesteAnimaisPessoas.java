package testeExercicio2;

import exercicio2.*;
import org.junit.Test;

public class TesteAnimaisPessoas {
@Test
    public void deveriaMostrtarOsDadosDosAnimais (){
        Animal animal = new Animal("lilu", "vaca");
        Cachorro cachorro = new Cachorro("Theo", "vira-lata");
        Gato gato = new Gato("jojo", "laranja");

        System.out.println("-----Animal-----");
        animal.exibeDados();
        System.out.println("-----doguinho------");
        cachorro.exibeDados();
        System.out.println("-----Gatinho----");
        gato.exibeDados();
        System.out.println("-----------------------------------------------------");


    }
    @Test
    public void deveriaMostrtarOsDadosDasPessoas (){
        Pessoa pessoa = new Pessoa("Leonardo", 19);
        Rica rica = new Rica("Lucas", 20, 20000,  "Comprei um carro");
        Pobre pobre = new Pobre("Danielle", 18, 10.00, "Comprei 2 miojos","1 emprego");
        Miseravel miseravel = new Miseravel("Thiago", 19, 0.00, "Não tenho dinheiro", "Não", "sim");

        System.out.println("-----Pessoa-----");
        pessoa.exibeDados();
        System.out.println("------Rica-----");
        rica.exibeDados();
        System.out.println("-----Pobre-----");
        pobre.exibeDados();
        System.out.println("------Miserável-----");
        miseravel.exibeDados();
        System.out.println("-----------------------------------------------------");
    }

}
