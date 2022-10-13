package CheckedUnchecked;

/**
 * Throwable es la clase superior de las excepciones, esta a su vez contiene dos grandes grupos, Exception y Error.
 * La diferencia radica en que el grupo de las Exception son lanzadas por el usuario que programa sobre la JVM, por
 * ejemplo de RuntimeException el NullPointerException y el grupo de los Error que son lanzados por los programadores
 * que mantienen la JVM, los cuales no se pueden controlar, es decir que no se puede capturar en un bloque try catch,
 * por ejemplo el StackOverflowError.
 *
 * Exception persanalizada de tipo Unchecked que extiende de RuntimeException heredando sus metodos.
 * Una excepcion de tipo Unchecked significa que el JVM no obliga a especificar la excepcion lanzada.
 */
public class MyExceptionUnchecked extends RuntimeException {

  /**
   * constructor de MyExceptionUnchecked que hereda el constructor de RuntimeException
   */
  public MyExceptionUnchecked() {
    super();
  }

  /**
   * constructor de MyExceptionUnchecked que hereda el constructor de RuntimeException
   * recibe un parametro tipo String y lo envia a la herencia padre con super()
   * @param message
   */
  public MyExceptionUnchecked(String message) {
    super(message);
  }

}
