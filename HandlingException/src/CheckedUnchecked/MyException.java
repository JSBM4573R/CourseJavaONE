package CheckedUnchecked;

/**
 * Exception persanalizada que extiende de RuntimeException heredando sus metodos.
 */
public class MyException extends RuntimeException {

  /**
   * constructor de MyException que hereda el constructor de RuntimeException
   */
  public MyException() {
    super();
  }

  /**
   * constructor de MyException que hereda el constructor de RuntimeException
   * recibe un parametro tipo String y lo envia a la herencia de RuntimeException
   * @param message
   */
  public MyException(String message) {
    super(message);
  }

}
