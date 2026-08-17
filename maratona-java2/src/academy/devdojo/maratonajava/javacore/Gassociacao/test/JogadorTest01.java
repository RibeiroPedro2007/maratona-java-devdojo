package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    static void main(String[] args) {
        Jogador j1 = new Jogador("Pelé");
        Jogador j2 = new Jogador("Cafú");
        Jogador j3 = new Jogador("Vini");
        Jogador[] jogadores = {j1, j2, j3};
        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }
    }

}
