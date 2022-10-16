package TryWithResources;


/**
 * Clase que imita una conexión con una base de datos para consumir data.
 * Ademas implementa la interfaz AutoCloseable la cual permite cerrar el recurso,
 * dentro del bloque try - catch, este nos evita agregar un finally dentro del bloque.
 */
public class Connection implements AutoCloseable {

  /**
   * Constructor que abre la conexion al momento de instanciar la clase
   */
  public Connection() {
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
  public void cerrar() {
    System.out.println("Cerrando la conexion");
  }

  /**
   * Cierra la conexion
   */
  @Override
  public void close() {
    cerrar();
  }
}
