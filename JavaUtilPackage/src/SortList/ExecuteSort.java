package SortList;

import Resources.Cuenta;
import Resources.CuentaAhorros;
import Resources.CuentaCorriente;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExecuteSort {

  /**
   * Contiene el metodo sort y una interfaz Funcional
   * @param args
   */
  public static void main(String[] args) {

    List<Cuenta> cuentaList = new ArrayList<>();

    CuentaAhorros cuentaAhorros = new CuentaAhorros();
    cuentaAhorros.setNumber("234234");
    cuentaList.add(cuentaAhorros);

    CuentaAhorros cuentaAhorrosDos = new CuentaAhorros();
    cuentaAhorrosDos.setNumber("457458");
    cuentaList.add(cuentaAhorrosDos);

    CuentaCorriente cuentaCorriente = new CuentaCorriente();
    cuentaCorriente.setNumber("123123");
    cuentaList.add(cuentaCorriente);

    System.out.println("<<< Antes de ordenar >>>");

    for (Cuenta cuenta : cuentaList) {
      System.out.println(cuenta.getNumber());
    }

    //El metodo Sort recibe una interfaz funcional Comparator<T>
    //Comparator<Cuenta> comparator = new OrdenadorPorNumeroCuenta();
    cuentaList.sort(new OrdenadorPorNumeroCuenta());  //Se puede llamar la clase ya que la misma implementa Comparator

    System.out.println("<<< Despues de ordenar >>>");

    for (Cuenta cuenta : cuentaList) {
      System.out.println(cuenta.getNumber());
    }

    //Despues de implementar la interfaz Comparable<T> podemos usar el metodo sort de Collections la cual recibe un orden natural
    Collections.sort(cuentaList);

    System.out.println("<<< Despues de ordenar por orden Natural >>>");

    for (Cuenta cuenta : cuentaList) {
      System.out.println(cuenta.getNumber());
    }


  }
}

/**
 * Clase que compara y retorna los numeros de menor a mayor al metodo sort
 */
class OrdenadorPorNumeroCuenta implements Comparator<Cuenta> {

  @Override
  public int compare(Cuenta o1, Cuenta o2) {
    Integer numberO1Cast = Integer.valueOf(o1.getNumber());
    Integer numberO2Cast = Integer.valueOf(o2.getNumber());
    if (numberO1Cast.equals(numberO2Cast)) {
      return 0;
    } else if (numberO1Cast > numberO2Cast) {
      return 1;
    } else {
      return -1;
    }
  }
}

/**
 * Orden natural implementando la interfaz Comparable<T> en la Clase Cuenta
 */
class OrdenarPorOrdenNatural implements Comparator<Cuenta> {
  @Override
  public int compare(Cuenta o1, Cuenta o2) {
    Integer numberO1Cast = Integer.valueOf(o1.getNumber());
    Integer numberO2Cast = Integer.valueOf(o2.getNumber());
    //Forma Wrapper
    return Integer.compare(numberO1Cast, numberO2Cast);
  }
}
