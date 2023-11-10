package modelo;


public class MiembroBanda {
    private String nombre;
    private String instrumento;
    private int experiencia;

  public MiembroBanda(String nombre, String instrumento, int experiencia) {
        this.nombre = nombre;
        this.instrumento = instrumento;
        this.experiencia = experiencia;
    }

    // Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
}
