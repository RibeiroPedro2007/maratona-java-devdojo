package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    static void main(String[] args) {
        Calculadora calculadora= new Calculadora();
        double result = calculadora.divideDoisNumeros(12, 2);
        System.out.println(calculadora);//não faz nada
        System.out.println(result);//recebe o resultado que o metodo retorna pq ele retorna pra quem chama, no caso result chama, so imprimir o objeto ele nao faz nada

        calculadora.imprimeDivideDoisNumeros(20,10);
        System.out.println(calculadora);
    }
}
