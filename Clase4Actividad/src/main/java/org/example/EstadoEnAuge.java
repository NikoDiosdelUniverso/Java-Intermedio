package org.example;


import static org.example.Icono.ROCKET;

public class EstadoEnAuge implements Estado{
    @Override
    public String displaySongDetail(Cancion song) {
        // “Nombre del artista – Título de la canción (Nombre del Álbum – Año del Álbum)”
        return ROCKET.texto() + song.getArtist() + " - " + song.getTitle() + " (" + song.getAlbum() + " - " + song.getAlbumyear() + ")";
    }
}
