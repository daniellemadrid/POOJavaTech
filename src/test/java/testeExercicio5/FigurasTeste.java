package testeExercicio5;

import exercicio5.Circulo;
import exercicio5.Quadrado;
import exercicio5.Retangulo;
import exercicio5.Triangulo;

public class FigurasTeste {

    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado();
        Triangulo triangulo = new Triangulo("Azul", 5, 12);
        Circulo circulo = new Circulo("Verde", 10.2);
        Retangulo retangulo = new Retangulo("Roxo", 32, 12);

        quadrado.setCor("Roxo");
        quadrado.setLado1(4);

        System.out.println(quadrado);
        System.out.println(triangulo);
        System.out.println(circulo);
        System.out.println(retangulo);


    }
}
