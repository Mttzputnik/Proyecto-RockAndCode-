package modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class Album implements Informacion {
    private String titulo;
    private Date fechaLanzamiento;
    private List<Cancion> canciones;
    private List<CriticaResena> criticasResenas;
    private int ventas;
    private List<Cancion> sencillosDestacados;

    public Album(String titulo, Date fechaLanzamiento) {
        this.titulo = titulo;
        this.fechaLanzamiento = fechaLanzamiento;
        this.canciones = new ArrayList<>();
        this.criticasResenas = new ArrayList<>();
        this.sencillosDestacados = new ArrayList<>();
    }

    // Getters y Setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public List<Cancion> getCanciones() {
        return canciones;
    }

    public void setFechaLanzamiento(Date fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }

    public List<Cancion> getSencillosDestacados() {
        return sencillosDestacados;
    }

    public void setSencillosDestacados(List<Cancion> sencillosDestacados) {
        this.sencillosDestacados = sencillosDestacados;
    }

    public List<CriticaResena> getCriticasResenas() {
        return criticasResenas;
    }   

    // Métodos para la gestión de canciones y críticas
    public void agregarCancion(Cancion cancion) {
        this.canciones.add(cancion);
    }

    public void agregarCriticaResena(CriticaResena criticaResena) {
        this.criticasResenas.add(criticaResena);
    }

    // Otros métodos

    public void lanzarAlbum(String titulo, Date fechaLanzamiento) {
        this.titulo = titulo;
        this.fechaLanzamiento = fechaLanzamiento;
    }

    @Override
    public void registrarInformacion() throws InformacionException {
        try (FileWriter writer = new FileWriter("src/archivos/album.txt")) {
            writer.write("Título del Álbum: " + titulo + "\n");
            writer.write("Fecha de Lanzamiento: " + fechaLanzamiento + "\n");
            writer.write("Número de Ventas: " + ventas + "\n");

            // Puedes incluir más información y formatearla según tus necesidades

            System.out.println("Información del álbum registrada en 'album.txt'.");
        } catch (IOException e) {
            throw new InformacionException("Error al registrar información: " + e.getMessage());
        }
    }

    @Override
    public void actualizarInformacion() throws InformacionException {
        try (FileWriter writer = new FileWriter("src/archivos/album.txt")) {
            writer.write("Título del Álbum: " + titulo + "\n");
            writer.write("Fecha de Lanzamiento: " + fechaLanzamiento + "\n");
            writer.write("Número de Ventas: " + ventas + "\n");

            // Puedes incluir más información y formatearla según tus necesidades

            System.out.println("Información del álbum actualizada en 'album.txt'.");
        } catch (IOException e) {
            throw new InformacionException("Error al actualizar información: " + e.getMessage());
        }
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        StringBuilder sb = new StringBuilder();
        sb.append("Álbum: ").append(titulo).append("\n");
        sb.append("Fecha de Lanzamiento: ").append(dateFormat.format(fechaLanzamiento)).append("\n");
        sb.append("Número de Ventas: ").append(ventas).append("\n");
        sb.append("Canciones:\n");
        for (Cancion cancion : canciones) {
            sb.append("- ").append(cancion.getNombre()).append("\n");
        }
        sb.append("Críticas y Reseñas:\n");
        for (CriticaResena critica : criticasResenas) {
            sb.append("- ").append(critica.getComentario()).append("\n");
        }
        return sb.toString();
    }

}
