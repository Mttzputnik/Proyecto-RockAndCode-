package pruebas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import modelo.BoletosInsuficientesException;
import modelo.Cancion;
import modelo.Concierto;

public class ConciertoTest {
    private Concierto concierto;

    @BeforeEach
    public void actulizar() {;
        concierto = new Concierto(new Date(), "Ubicación de Prueba", 1000);
    }

    @Test
    public void testAsignarListaCanciones() {
        List<Cancion> canciones = new ArrayList<>();
        canciones.add(new Cancion("Cancion1"));
        canciones.add(new Cancion("Cancion2"));
        concierto.asignarListaCanciones(canciones);
        assertEquals(2, concierto.getCancionesProgramadas().size());
        assertTrue(concierto.getCancionesProgramadas().containsAll(canciones));
    }

    @Test
    public void testRegistrarBoletosVendidos() {
        try {
            concierto.registrarBoletosVendidos(500);
            assertEquals(500, concierto.getBoletosVendidos());
        } catch (BoletosInsuficientesException e) {
            fail("Se generó una excepción inesperada");
        }
    }

    @Test
    public void testRegistrarBoletosVendidos_Excepcion() {
        try {
            concierto.registrarBoletosVendidos(1500); // Esto excederá la capacidad del lugar
            fail("Se esperaba una excepción BoletosInsuficientesException");
        } catch (BoletosInsuficientesException e) {
            assertEquals("No hay suficientes boletos disponibles para la venta.", e.getMessage());
        }
    }
}
