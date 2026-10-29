package academy.devdojo.maratonajava.javacore.Dconstrutores.test;

import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyuu", "TV", 12, "Açao");
        Anime anime2 = new Anime();
        // anime.setGenero("Ação");
        anime.imprime();
        anime2.imprime();
    }
}
