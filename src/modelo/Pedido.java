package modelo;


import java.util.List;

public class Pedido {
    private List<ArticuloPedido> articulos;
    private String direccionEnvio;
    private String estado;

    public Pedido(List<ArticuloPedido> articulos, String direccionEnvio) {
        this.articulos = articulos;
        this.direccionEnvio = direccionEnvio;
        this.estado = "Pendiente"; // Estado inicial
    }

     // Otros Getters y Setters

    public List<ArticuloPedido> getArticulos() {
        return articulos;
    }

    public void setArticulos(List<ArticuloPedido> articulos) {
        this.articulos = articulos;
    }

    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Métodos para actualizar estado
    public void actualizarEstado(String estado) {
        this.estado = estado;
    }

  public void tomarPedido(List<ArticuloPedido> articulos, String direccion) {
      setArticulos(articulos);
      setDireccionEnvio(direccion);
      setEstado("Pendiente"); 
  }


   
}
