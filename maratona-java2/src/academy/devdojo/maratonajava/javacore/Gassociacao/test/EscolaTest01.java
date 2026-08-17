package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    static void main(String[] args) {
        Professor prof1= new Professor("Jiraya");
        Professor prof2= new Professor("eu memo");
        Professor[] profs= {prof1, prof2};
        Escola esc= new Escola("Konoha", profs);
        esc.imprime();

    }
}
