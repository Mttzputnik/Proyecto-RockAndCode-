package pruebas;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import modelo.Album;
import modelo.Cancion;
import modelo.CriticaResena;

public class AlbumTest {
    private Album album;

    @BeforeEach
    public void actualizar() {

        album = new Album("Álbum de Prueba", new Date());
    }

    @Test
    public void testRegistrarInformacion() {

        // Prueba la escritura en archivo
        assertDoesNotThrow(() -> album.registrarInformacion());
    }

    @Test
    public void testAgregarCancion() {
        Cancion cancion = new Cancion("Canción de Prueba");
        album.agregarCancion(cancion);
        assertTrue(album.getCanciones().contains(cancion));
    }

    @Test
    public void testAgregarCriticaResena() {
        CriticaResena critica = new CriticaResena(4, "Comentario de Prueba");
        album.agregarCriticaResena(critica);
        assertTrue(album.getCriticasResenas().contains(critica));
    }
}
