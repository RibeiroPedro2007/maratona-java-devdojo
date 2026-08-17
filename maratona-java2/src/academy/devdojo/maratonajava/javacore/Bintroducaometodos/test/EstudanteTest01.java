package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    static void main(String[] args) {
        Estudante estudante= new Estudante();
        Estudante estudante2= new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante.nome ="Meu";
        estudante.idade =18;
        estudante.sexo ='M';

        estudante2.nome ="Meuti";
        estudante2.idade =19;
        estudante2.sexo ='F';

        impressora.imprime(estudante);
        impressora.imprime(estudante2);
    }
}
