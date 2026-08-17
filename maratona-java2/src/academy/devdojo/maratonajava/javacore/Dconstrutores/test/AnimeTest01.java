package academy.devdojo.maratonajava.javacore.Dconstrutores.test;

import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    static void main(String[] args) {
        Anime anime = new Anime("Dragon ball","TV",8, "Ação", "Gibli");
        Anime anime2 =new Anime("Dragon ball","TV",8, "Ação");
        anime2.imprime();
        anime.imprime();
    }
}
