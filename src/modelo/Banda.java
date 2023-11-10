package modelo;

import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;
import java.io.IOException;



public class Banda implements Informacion {
    private String nombre;
    private List<MiembroBanda> miembros;
    private String generoMusical;
    private String historia;

    public Banda(String nombre, String generoMusical, String historia) {
        this.nombre = nombre;
        this.generoMusical = generoMusical;
        this.historia = historia;
        this.miembros = new ArrayList<>();
    }

  //Getters y Setters
  public String getNombre() {
      return nombre;
  }

  public void setNombre(String nombre) {
      this.nombre = nombre;
  }

  public String getGeneroMusical() {
      return generoMusical;
  }

  public void setGeneroMusical(String generoMusical) {
      this.generoMusical = generoMusical;
  }

  public String getHistoria() {
      return historia;
  }

  public void setHistoria(String historia) {
      this.historia = historia;
  }

    // Métodos para gestionar miembros
    public void agregarMiembro(String nombre, String instrumento, int experiencia) {
        MiembroBanda nuevoMiembro = new MiembroBanda(nombre, instrumento, experiencia);
        miembros.add(nuevoMiembro);
    }

    // Métodos para actualizar información de la banda
    public void actualizarInformacionBanda(String generoMusical, String historia) {
        this.generoMusical = generoMusical;
        this.historia = historia;
    }

    // Implementación de los métodos de la interfaz Informacion
   public void registrarInformacion() {
       try (FileWriter writer = new FileWriter("src/archivos/banda.txt")) {
           writer.write("Nombre: " + nombre + "\n");
           writer.write("Género Musical: " + generoMusical + "\n");
           writer.write("Historia: " + historia + "\n");
           System.out.println("Información de la banda registrada en 'banda.txt'.");
       } catch (IOException e) {
           System.err.println("Error al registrar información: " + e.getMessage());
       }
   }


   @Override
   public void actualizarInformacion() {
       try (FileWriter writer = new FileWriter("src/archivos/banda.txt")) {
           writer.write("Nombre: " + nombre + "\n");
           writer.write("Género Musical: " + generoMusical + "\n");
           writer.write("Historia: " + historia + "\n");
           System.out.println("Información de la banda actualizada en 'banda.txt'.");
       } catch (IOException e) {
           System.err.println("Error al actualizar información: " + e.getMessage());
       }
   }

  

}
