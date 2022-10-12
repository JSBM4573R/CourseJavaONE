package ThreadExecution;

public class Thread {

  public static void main(String[] args) {
    System.out.println("Inicio Main");
    methodThread();
    System.out.println("Fin Main");
  }

  /**
   * Este metodo contiene un error en el Stack de ejecucion para poder visualizar
   * La estructura del error. Esa estructura contiene el nombre, una descripcion y
   * el Stack Trace, que es la pila de ejecucion del codigo, mostrando en que linea
   * se rompio el codigo.
   * En este caso como no se maneja la exepcion el codigo no continua su ejecucion.
   */
  private static void methodThread() {
    System.out.println("Inicio metodo Thread");
    for (int i = 0; i < 3; i++) {
      System.out.println(i);
      int result = i / 0; //Division intensional entre 0 para provocar un Error
      System.out.println(result);
    }
    System.out.println("Fin metodo Thread");
  }
}
