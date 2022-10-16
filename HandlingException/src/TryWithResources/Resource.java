package TryWithResources;

/**
 * Dentro de su metodo principal se encuentra un try con recursos
 * el cual instancia la clase Connection que implementa AutoCloseable para cerrar la conexion.
 */
public class Resource {

  public static void main(String[] args) {

    //Se incializa un recurso en el try. Este recurso debe implementar la Interfaz AutoCloseable
    try (Connection con = new Connection()) {
      con.readData();
    } catch (IllegalStateException ex) {
      System.out.println("Ocurrio un error en la conexion ");
      ex.printStackTrace();
    }
  }
}
