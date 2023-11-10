package modelo;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Concierto {
    private Date fechaHora;
    private String ubicacion;
    private List<Cancion> cancionesProgramadas;
    private int boletosVendidos;
    private int capacidadLugar;

    public Concierto(Date fechaHora, String ubicacion, int capacidadLugar) {
        this.fechaHora = fechaHora;
        this.ubicacion = ubicacion;
        this.capacidadLugar = capacidadLugar;
        this.cancionesProgramadas = new ArrayList<>();
    }

     // Getters y Setters

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getBoletosVendidos() {
        return boletosVendidos;
    }

    public void setBoletosVendidos(int boletosVendidos) {
        this.boletosVendidos = boletosVendidos;
    }

    public int getCapacidadLugar() {
        return capacidadLugar;
    }

    public void setCapacidadLugar(int capacidadLugar) {
        this.capacidadLugar = capacidadLugar;
    }

    // Métodos para la gestión de canciones
    public void asignarListaCanciones(List<Cancion> canciones) {
        this.cancionesProgramadas.addAll(canciones);
    }

    // Otros métodos

    public void programarConcierto(Date fechaHora, String ubicacion) {
        this.fechaHora = fechaHora;
        this.ubicacion = ubicacion;
    }

    public void registrarBoletosVendidos(int boletos) {
        this.boletosVendidos += boletos;
    }

   
}
