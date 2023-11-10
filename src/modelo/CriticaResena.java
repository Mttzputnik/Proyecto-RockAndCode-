package modelo;


public class CriticaResena {
    private int calificacion;
    private String comentario;

    public CriticaResena(int calificacion, String comentario) {
        this.calificacion = calificacion;
        this.comentario = comentario;
    }

    // Getters y Setters

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
