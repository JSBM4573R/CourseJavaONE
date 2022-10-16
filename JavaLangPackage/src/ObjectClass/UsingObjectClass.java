package ObjectClass;

import Packages.com.bytebank.model.User;

public class UsingObjectClass {

  /**
   * Contiene el uso de la clase Object que es el padre de los objetos en java
   * @param args
   */
  public static void main(String[] args) {

    //No es necesario heredar de Object explicitamente, el compilador inserta automatiamente la declaracion
    Object user = new User("Juan","juan@gmail.com","234234");
    printLine(user);
    printLine(user.getClass());

    //Cuando se declara la clase automaticamente hereda de la clase raiz Object
    User userTwo = new User();
    userTwo.setName("Maria Paula");
    userTwo.setEmail("maria@gmail.com");
    userTwo.setPassword("321321");
    printLine(userTwo);

    /*
    Cualquier clase puede ser recibida como un Object
     */

    char num1 = 1;
    printLine(num1);

    int num2 = 2;
    printLine(num2);

    double num3 = 2.0;
    printLine(num3);

    boolean val = false;
    printLine(val);

  }

  /**
   * Imprime el objeto recibido como parametro y lo imprime
   * @param value cualquier objeto a imprimir
   */
  private static void printLine(Object value) {
    //Se declara el parametro como Object ya que es la clase Padron en java y evita sobrecarga de metodo.
    System.out.println(value);
  }
}
