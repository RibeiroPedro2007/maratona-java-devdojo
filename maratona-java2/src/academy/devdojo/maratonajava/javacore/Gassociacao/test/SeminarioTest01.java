package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Prof;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class SeminarioTest01 {
    static void main(String[] args) {
        Local local = new Local("Rua Amapá");
        Aluno alun = new Aluno("Ribeiro", 28);
        Aluno[] alunosParaSeminario = {alun};
        Seminario sem = new Seminario("Laranjas boas para plantio", local, alunosParaSeminario);
        Seminario[] seminariosMinistrados= {sem};
        Prof prof = new Prof("Roger", "Sistemas", seminariosMinistrados);
        prof.imprime();
    }
}
