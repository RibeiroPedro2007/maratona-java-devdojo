package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    static void main(String[] args) {
        Jogador jog= new Jogador("Cafu");
        Jogador jog2= new Jogador("Pelé");
        Time time= new Time("Santos");
        Jogador[] jogs= {jog,jog2};

        jog.setTime(time);
        jog2.setTime(time);
        time.setJogs(jogs);

        System.out.println("-----------");
        jog.imprime();
        System.out.println("-----------");
        jog2.imprime();
        System.out.println("-----------");
        time.imprime();
    }
}
