package pruebas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import modelo.Concierto;
import modelo.Fanatico;

public class FanaticoTest {
    private Fanatico fanatico;

    @BeforeEach
    public void actulizar() {
        fanatico = new Fanatico("Nombre de Prueba", "correo@prueba.com", "Ubicación de Prueba");
    }

    @Test
    public void testAsistirConcierto() {
        Concierto concierto = new Concierto(null, "Ubicación", 1000);
        fanatico.asistirConcierto(concierto);
        List<Concierto> conciertosAsistidos = fanatico.getConciertosAsistidos();
        assertEquals(1, conciertosAsistidos.size());
        assertEquals(concierto, conciertosAsistidos.get(0));
    }

    @Test
    public void testRegistrarFanatico() {
        fanatico.registrarFanatico("Nuevo Nombre", "correo@nuevo.com", "Nueva Ubicación");
        assertEquals("Nuevo Nombre", fanatico.getNombre());
        assertEquals("correo@nuevo.com", fanatico.getCorreoElectronico());
        assertEquals("Nueva Ubicación", fanatico.getUbicacion());
    }

    @Test
    public void testRegistrarRedesSociales() {
        List<String> redesSociales = List.of("Facebook", "Twitter", "Instagram");
        fanatico.setRedesSociales(redesSociales);
        assertEquals(redesSociales, fanatico.getRedesSociales());
    }
}
