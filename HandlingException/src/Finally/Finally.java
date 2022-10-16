package Finally;

/**
 * El metodo principal de esta clase contiene un bloque try - catch - finally
 * EL scope finally es opcional dependiendo del alcance y este se ejecuta siempre.
 */
public class Finally {

  public static void main(String[] args) {
    //Se instancia la clase como null para manejar la exception
    Connection con = null;

    try {
      //Se inicializa la clase dentro del scope y se traen sus metodos
      con = new Connection();
      con.readData();
      con.close();
    } catch (IllegalStateException | NullPointerException ex) {
      ex.printStackTrace();
      System.out.println("Surgio una error en la conexión ");
    } finally {
      //Usamos finally que se ejecuta siempre cuando termine el bloque try catch para cerrar la conexion
      con.close();
    }

  }
}
