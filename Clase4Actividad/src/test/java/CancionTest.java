import org.example.Cancion;
import org.junit.Before;
import org.junit.Test;


import static org.example.Icono.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class CancionTest {
    private Cancion cancion;

    @Before
    public void setUp() {
        cancion = new Cancion("Coldplay", "A Rush of Blood to the head", 2002, "The Scientist");
    }

    @Test
    public void cancionExiste() {
        assertNotNull("should not be null", cancion);
    }

    @Test
    public void cancionEsLanzada() {
        assertEquals(MUSICAL_NOTE + "Coldplay - A Rush of Blood to the head - The Scientist", cancion.displaySongDetail());
    }

    @Test
    public void cancionEnAuge() {
        cancion.play(1500);
        assertEquals(ROCKET + "Coldplay - The Scientist (A Rush of Blood to the head - 2002)", cancion.displaySongDetail());
    }

    @Test
    public void cancionDejaDeEstarEnAuge() {
        cancion.play(1500);
        cancion.dislike(6000);
 //       assertEquals(6000, cancion.getDislikes());
        assertEquals(MUSICAL_NOTE + "Coldplay - A Rush of Blood to the head - The Scientist", cancion.displaySongDetail());
    }

    @Test
    public void cancionEnTendencia(){
        cancion.play(60000);
        cancion.like(50000);
        cancion.setReproducedLast24Hours(true);
        assertEquals(FIRE + "The Scientist - Coldplay (A Rush of Blood to the head - 2002)", cancion.displaySongDetail());
    }

    @Test
    public void cancionDejaDeEstarEnTendencia() {
        cancion.play(100000);
        cancion.like(60000);
        cancion.setReproducedLast24Hours(false);
        assertEquals(MUSICAL_NOTE + "Coldplay - A Rush of Blood to the head - The Scientist", cancion.displaySongDetail());
    }
}
