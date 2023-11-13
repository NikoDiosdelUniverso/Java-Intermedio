package org.example;

public class Main {
    public static void main(String[] args) {
        Cancion cancion = new Cancion("Coldplay", "A Rush of Blood to the head", 2002, "The Scientist");
        cancion.play(60000);
        cancion.like(50000);
        cancion.setReproducedLast24Hours(true);
        System.out.println(cancion.displaySongDetail());
    }
}