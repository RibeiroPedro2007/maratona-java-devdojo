package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Dragon ball","TV",8);// usa o first init
        anime.init("Dragon ball","TV",8, "Ação");// usa o last init
        anime.imprime();
    }
}
