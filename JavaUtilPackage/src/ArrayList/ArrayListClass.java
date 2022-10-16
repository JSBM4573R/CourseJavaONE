package ArrayList;

import Resources.Cuenta;
import Resources.CuentaAhorros;
import Resources.CuentaCorriente;

import java.util.ArrayList;

public class ArrayListClass {

  /**
   * Contiene el uso de la Clase ArrayList y como recorrerlo
   * Ademas del significado de Generics
   * @param args
   */
  public static void main(String[] args) {

    String number = "234234";

    /*
    En java los generics <T> son los espacios que tienen un objeto que acepta como parametro
    para la construccion del mismo Objeto de referencia
     */
    //        generic         | tipo de objeto en memoria HEAD
    ArrayList<Cuenta> lista = new ArrayList<>();
    Cuenta cc = new CuentaCorriente();
    cc.setNumber(number);
    lista.add(cc);

    Cuenta ca = new CuentaAhorros();
    ca.setNumber(number);
    lista.add(ca);

    //Por cada Cuenta de la lista
    for (Cuenta cuenta : lista) {
      //traiga su type de la cuenta
      System.out.println(cuenta.type() +" "+ cuenta);
    }
  }
}