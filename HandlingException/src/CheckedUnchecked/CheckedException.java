package CheckedUnchecked;

public class CheckedException {

  public static void main(String[] args) throws Exception {
    System.out.println("Inicio Main");
    methodCustomException();
    System.out.println("Fin Main");
  }

  /**
   * Este metodo contiene el lanzamiento de la Excepcion del tipo Checked creada en la clase CheckedException
   * el cual obliga a especificar con throws Exception en el metodo de que tipo de excepcion se espera lanzar
   * en el scope.
   */
  private static void methodCustomException() throws Exception {
    System.out.println("Inicio metodo CustomException");
    throw new MyExceptionChecked("Mi excepcion fue lanzada");
  }
}


