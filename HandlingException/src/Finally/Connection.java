package Finally;


/**
 * Clase que imita una conexión con una base de datos para consumir data.
 */
public class Connection{

  /**
   * Constructor que abre la conexion al momento de instanciar la clase
   */
  public Connection () {
    System.out.println("Abriendo conexión");
  }

  /**
   * Lee la data de la conexion
   * Ademas contiene el lanzamiento de una Exception
   */
  public void readData() {
    System.out.println("Recibiendo datos");
    throw new IllegalStateException();
  }

  /**
   * Cierra la conexion
   */
  public void close() {
    System.out.println("Cerrando la conexion");
  }
}
