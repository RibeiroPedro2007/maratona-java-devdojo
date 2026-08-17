package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    static void main(String[] args) {
        Jogador j1 = new Jogador("Pelé");
        Time time = new Time("Seleção");
        j1.setTime(time);
        j1.imprime();
    }
}
