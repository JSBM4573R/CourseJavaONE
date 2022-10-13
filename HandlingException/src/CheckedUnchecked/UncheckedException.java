package CheckedUnchecked;

public class UncheckedException {

  public static void main(String[] args) {
    System.out.println("Inicio Main");
    try {
      methodCustomException();
    } catch (MyExceptionUnchecked ex) {
      ex.printStackTrace();
    }
    System.out.println("Fin Main");
  }

  /**
   * Este metodo contiene el lanzamiento de la Excepcion creada en la clase MyExceptionUnchecked
   */
  private static void methodCustomException() {
    System.out.println("Inicio metodo CustomException");
    throw new MyExceptionUnchecked("Mi excepcion fue lanzada");
  }
}
