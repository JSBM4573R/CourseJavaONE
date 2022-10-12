package ThreadExecution;

public class ControlException {

  public static void main(String[] args) {
    System.out.println("Inicio Main");
    methodControl();
    System.out.println("Fin Main");
  }

  /**
   * Este metodo parecido al creado en la clase Thread contiene un error provocado
   * de forma intencional, pero se agrega un bloque try catch lo que permite atrapar
   * la excepcion y evita que el codigo se rompa en la pila de ejecucion o Stack.
   * Se debe crear una exception acorde a la posibilidad de ocurriencia de un error.
   * Ademas se debe mostrar el Stack Trace para exponer la linea de error.
   */
  private static void methodControl() {
    System.out.println("Inicio metodo Control");
    for (int i = 0; i < 3; i++) {
      System.out.println(i);
      try {
        int result = i / 0; //Division intensional entre 0 para provocar un Error
        System.out.println(result);
      } catch (ArithmeticException e) {
        e.printStackTrace();
        System.out.println(e.getMessage());
      }
    }
    System.out.println("Fin metodo Control");
  }
}
