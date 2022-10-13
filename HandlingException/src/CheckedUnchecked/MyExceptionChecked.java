package CheckedUnchecked;

/**
 * Throwable es la clase superior de las excepciones, esta a su vez contiene dos grandes grupos, Exception y Error.
 * La diferencia radica en que el grupo de las Exception son lanzadas por el usuario que programa sobre la JVM, por
 * ejemplo de RuntimeException el NullPointerException y el grupo de los Error que son lanzados por los programadores
 * que mantienen la JVM, los cuales no se pueden controlar, es decir que no se puede capturar en un bloque try catch,
 * por ejemplo el StackOverflowError.
 *
 * Exception persanalizada de tipo Checked que extiende de Exception heredando sus metodos.
 * Una excepcion de tipo Checked significa que el JVM obliga directamente a especificar la excepcion lanzada en el scope.
 */
public class MyExceptionChecked extends Exception {

  /**
   * constructor de MyExceptionChecked que hereda el constructor de Exception
   */
  public MyExceptionChecked() {
    super();
  }

  /**
   * constructor de MyExceptionChecked que hereda el constructor de Exception
   * recibe un parametro tipo String y lo envia a la herencia padre con super();
   * @param message
   */
  public MyExceptionChecked(String message) {
    super(message);
  }

}
