import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import modelo.*;

public class Main {
    public static void main(String[] args) {
        try {
            Banda banda = new Banda("Rock & Code", "Rock", "Historia de la banda");
            banda.agregarMiembro("Miembro1", "Guitarra", 5);
            registrarActualizarInformacion(banda);

            Concierto concierto = new Concierto(new Date(), "Ubicacion", 1000);
            List<Cancion> canciones = new ArrayList<>();
            canciones.add(new Cancion("Cancion1"));
            canciones.add(new Cancion("Cancion2"));
            concierto.asignarListaCanciones(canciones);
            concierto.registrarBoletosVendidos(500);

            Album album = new Album("Album1", new Date());
            album.agregarCancion(new Cancion("Cancion1"));
            registrarActualizarInformacion(album);

            Fanatico fanatico = new Fanatico("Fanatico1", "correo@ejemplo.com", "Ubicacion1");
            fanatico.asistirConcierto(concierto);

            List<ArticuloPedido> articulos = new ArrayList<>();
            articulos.add(new ArticuloPedido("Producto1", 2));
            Pedido pedido = new Pedido(articulos, "Direccion1");
            pedido.actualizarEstado("Enviado");
        } catch (InformacionException | BoletosInsuficientesException e) {
            System.out.println(e.getMessage());
        }
    }

    // Método genérico para registrar y actualizar información de objetos que
    // implementan la interfaz Informacion
    public static void registrarActualizarInformacion(Informacion objeto) throws InformacionException {
        objeto.registrarInformacion();
        objeto.actualizarInformacion();
    }
}
