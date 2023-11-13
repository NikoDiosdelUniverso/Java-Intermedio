package org.example;

import static org.example.Icono.FIRE;

public class EstadoEnTendencia implements Estado{
    @Override
    public String displaySongDetail(Cancion song) {
        // “Título de la canción – Nombre del artista (Nombre del Álbum – Año del álbum)”
        return  FIRE.texto() + song.getTitle() + " - " + song.getArtist() + " (" + song.getAlbum() + " - " + song.getAlbumyear() + ")";
    }
}
