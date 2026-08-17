package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    static void main(String[] args) {
        Estudante estudante= new Estudante();
        Estudante estudante2= new Estudante();

        estudante.nome ="Meu";
        estudante.idade =18;
        estudante.sexo ='M';

        estudante2.nome ="Meuti";
        estudante2.idade =19;
        estudante2.sexo ='F';

        estudante.imprime();
        estudante2.imprime();
    }
}
