package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    static void main(String[] args) {
        Pessoa pessoa= new Pessoa();
        pessoa.setNome("Paulo");
        pessoa.setIdade(19);
        pessoa.imprime();
        System.out.println("________________________\n");
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
