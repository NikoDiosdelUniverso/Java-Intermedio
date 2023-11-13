package org.example;

import static org.example.Icono.MUSICAL_NOTE;

public class EstadoNormal implements Estado{
    @Override
    public String displaySongDetail(Cancion song) {
        // “Nombre del artista – Nombre del álbum – Título de la canción”
        return MUSICAL_NOTE.texto() + song.getArtist() + " - " + song.getAlbum() + " - " + song.getTitle();
    }
}
