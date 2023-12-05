package pruebas;    

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import modelo.Banda;
import modelo.MiembroBanda;
import modelo.MiembroNotFoundException;

public class BandaTest {
    private Banda banda;

    @BeforeEach
    public void actualizar() {
        banda = new Banda("Nombre de Prueba", "Género de Prueba", "Historia de Prueba");
    }

    @Test
    public void testAgregarMiembro() {
        banda.agregarMiembro("Nuevo Miembro", "Instrumento", 3);
        List<MiembroBanda> miembros = banda.getMiembros();
        assertEquals(1, miembros.size());
        assertEquals("Nuevo Miembro", miembros.get(0).getNombre());
    }

    @Test
    public void testBuscarMiembroPorNombreExitoso() throws MiembroNotFoundException {
        banda.agregarMiembro("Miembro Existente", "Instrumento", 5);
        MiembroBanda miembro = banda.buscarMiembroPorNombre("Miembro Existente");
        assertNotNull(miembro);
        assertEquals("Miembro Existente", miembro.getNombre());
    }

    @Test
    public void testBuscarMiembroPorNombreNoEncontrado() {
        assertThrows(MiembroNotFoundException.class, () -> banda.buscarMiembroPorNombre("No Existente"));
    }

    @Test
    public void testRegistrarInformacion() {
        assertDoesNotThrow(() -> banda.registrarInformacion());
        // Verifica que el registro de información no lance excepciones
    }

    @Test
    public void testActualizarInformacion() {
        assertDoesNotThrow(() -> banda.actualizarInformacion());
        // Verifica que la actualización de información no lance excepciones
    }
}
