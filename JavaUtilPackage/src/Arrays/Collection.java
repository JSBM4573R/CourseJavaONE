package Arrays;


import java.util.Arrays;

public class Collection {

  /**
   * Contiene ejemplos de Arrays y diferentes formas de su declaracion y recorrido
   * @param args
   */
  public static void main(String[] args) {

    /*
    Todos los Arrays se incializan con []
     0 1 2 3 4    --> Indice
    [ | | | | ]   --> Contenedor en memoria Head
    int[] numbers = new int[5]
     */

    //Primer forma de declara un Arrays
    int[] numbers = new int[5];
    numbers[0] = 1;
    System.out.println(numbers[0]);

    //Segunda forma de declarar un Arrays
    double amount[] = new double[5];
    amount[0] = 1;
    System.out.println(amount[0]);

    //Forma lietral de declarar un Array
    int[] refs = {1,2,3,4,5};

    //Recorrer con ForEach
    System.out.println("Recorriendo refs con foreach");
    for (int ref: refs) {
      System.out.println(ref);
    }

    //Saber el tamaño de un Arrays con .length
    System.out.println("Tamaño del Array numbers");
    System.out.println(numbers.length);

    //Recorrido de un Arrays
    System.out.println("Recorriendo  y agregando numbers con for");
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = i;
      System.out.println(numbers[i]);
    }

  }


}
