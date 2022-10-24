package Lambdas;

import Resources.Cuenta;
import Resources.CuentaAhorros;
import Resources.CuentaCorriente;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lambda {

  /**
   * Contiene funciones lambda
   * @param args
   */
  public static void main(String[] args) {
    List<Cuenta> cuentaList = new ArrayList<>();

    CuentaAhorros cuentaAhorros = new CuentaAhorros();
    cuentaAhorros.setNumber("234234");
    cuentaAhorros.setSaldo(20000);
    cuentaList.add(cuentaAhorros);

    CuentaAhorros cuentaAhorrosDos = new CuentaAhorros();
    cuentaAhorrosDos.setNumber("457458");
    cuentaAhorrosDos.setSaldo(10000);
    cuentaList.add(cuentaAhorrosDos);

    CuentaCorriente cuentaCorriente = new CuentaCorriente();
    cuentaCorriente.setNumber("123123");
    cuentaAhorrosDos.setSaldo(40000);
    cuentaList.add(cuentaCorriente);

    System.out.println("<<< Antes de ordenar por saldo >>>");

    for (Cuenta cuenta : cuentaList) {
      System.out.println(cuenta.getSaldo());
    }

    cuentaList.sort((Cuenta o1, Cuenta o2) ->
           Double.compare(o1.getSaldo(), o2.getSaldo())
        );


    System.out.println("<<< Despues de ordenar por saldo usando lambda expresion >>>");

    //Uso de lambdas en foreach

    //Implemento el consumer que recibe un solo generics en este caso un Objeto de tipo Cuenta
    cuentaList.forEach(cuenta -> System.out.println(cuenta));

    //Segundo metodo mas abreviado
    cuentaList.forEach(System.out::println);

  }
}


