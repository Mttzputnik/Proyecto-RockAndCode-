package modelo;


import java.util.ArrayList;
import java.util.List;

public class Fanatico {
    private String nombre;
    private String correoElectronico;
    private String ubicacion;
    private List<String> redesSociales;
    private List<Concierto> conciertosAsistidos;

    public Fanatico(String nombre, String correoElectronico, String ubicacion) {
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.ubicacion = ubicacion;
        this.redesSociales = new ArrayList<>();
        this.conciertosAsistidos = new ArrayList<>();
    }

    // Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public List<String> getRedesSociales() {
        return redesSociales;
    }

    public List<Concierto> getConciertosAsistidos() {
        return conciertosAsistidos;
    }

    public void setRedesSociales(List<String> redesSociales) {
        this.redesSociales = redesSociales;
    }

    // Métodos para la gestión de conciertos y fanáticos
    public void asistirConcierto(Concierto concierto) {
        this.conciertosAsistidos.add(concierto);
    }

    // Otros métodos

    public void registrarFanatico(String nombre, String correoElectronico, String ubicacion) {
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.ubicacion = ubicacion;
    }

    
}
