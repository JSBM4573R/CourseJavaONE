package CheckedUnchecked;

public class CustomException {

  public static void main(String[] args) {
    System.out.println("Inicio Main");
    try {
      methodCustomException();
    } catch (MyException ex) {
      ex.printStackTrace();
    }
    System.out.println("Fin Main");
  }

  /**
   * Este metodo contiene el lenazamiento de la Excepcion creada en la clase MyException
   */
  private static void methodCustomException() {
    System.out.println("Inicio metodo CustomException");
    throw new MyException("Mi excepcion fue lanzada");
  }
}
