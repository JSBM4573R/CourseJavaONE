package Equals;

import Resources.Cuenta;
import Resources.CuentaCorriente;

import java.util.ArrayList;

public class Equals {

  /**
   * Contiene el uso de equals
   * @param args
   */
  public static void main(String[] args) {

    ArrayList lista = new ArrayList();

    Cuenta cc = new CuentaCorriente();
    cc.setNumber("234234");
    lista.add(cc);

    Cuenta cc2 = new CuentaCorriente();
    cc2.setNumber("234234");
    lista.add(cc2);

    boolean contiene = lista.contains(cc2);
    //Comparacion por referencia no es recomendable
    if(contiene) {
      System.out.println("si");
    }

    //Comparacion por valores
    if(cc.esIgual(cc2)) {
      System.out.println("Usando mi metodo esIgual "+cc+" es igual a "+cc2);
    }

    //Comparacion con el metodo equals de Java
    if(cc.equals(cc2)) {
      System.out.println("Usando equals "+cc+" es igual a "+cc2);
    }
  }
}
