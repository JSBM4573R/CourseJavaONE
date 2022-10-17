package AnonymousClass;

import Resources.Cuenta;
import Resources.CuentaAhorros;
import Resources.CuentaCorriente;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClaseAnonima {

  /**
   * Contiene el uso de clases anonimas
   *
   * @param args
   */
  public static void main(String[] args) {

    /*
    Una clase anonima me permite, a nivel de parametro se puede implementar una clase que contiene una interfaz funcional
     */

    List<Cuenta> cuentaList = new ArrayList<>();

    Cuenta ca = new CuentaAhorros();
    ca.setNumber("234234");
    ca.setSaldo(20000);
    cuentaList.add(ca);

    Cuenta cc = new CuentaCorriente();
    cc.setNumber("123123");
    cc.setSaldo(10000);
    cuentaList.add(cc);

    System.out.println("<<< Antes de ordenar >>>");

    for (Cuenta cuenta : cuentaList) {
      System.out.println(cuenta.getNumber());
    }

    //             | Clase anonima
    cuentaList.sort(new Comparator<Cuenta>() {
      @Override
      public int compare(Cuenta o1, Cuenta o2) {
        return Double.compare(o1.getSaldo(),o2.getSaldo());
      }
    });

    System.out.println("<<< Despues de ordenar >>>");

    for (Cuenta cuenta : cuentaList) {
      System.out.println(cuenta.getNumber());
    }
  }

}