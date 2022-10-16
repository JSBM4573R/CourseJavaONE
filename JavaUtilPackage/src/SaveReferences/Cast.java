package SaveReferences;

import Resources.Cuenta;
import Resources.CuentaAhorros;
import Resources.CuentaCorriente;

import java.util.ArrayList;
import java.util.List;

public class Cast {

  /**
   * Contiene formas de Casteo de Objetos
   * Cast implicito y explicito
   * @param args
   */
  public static void main(String[] args) {

    CuentaAhorros ca = new CuentaAhorros();
    CuentaCorriente cc = new CuentaCorriente();

    //Se inicializa un Array de Objects
    Object[] cuentas = new Object[5];
    cuentas[1] = ca;
    cuentas[2] = cc;

    System.out.println("<<< Casteando con la referencia correcta >>>");
    //Con un "Cast" le informamos a Java especificamente que tipo de clase es el objeto declarado
    //Clase                |     cast     | Referencia correcta de Clase
    CuentaAhorros cuenta = (CuentaAhorros) cuentas[1];
    System.out.println(cuenta.type());

    System.out.println("<<< Casteando con error de referencia >>>");
    try {
      CuentaCorriente cuentaError = (CuentaCorriente) cuentas[1];
      System.out.println(cuentaError.type());
    } catch (ClassCastException ex) {
      System.out.println("No se puede castear una CuentaCorriente a tipo CuentaAhorros, porque cuentas en la posicion 1 " +
          "hace referencia a Cuenta de Ahorros");
    }

    System.out.println("<<< Cast implicito y explicito de refenrencias >>>");

    /*
    Cast Implicito
    En las referencias, se aplica el mismo principio.
    Si el cast siempre funciona no es necesario hacerlo explícito, por ejemplo:
     */
    CuentaCorriente cc1 = new CuentaCorriente();
    Cuenta cuentaCorriente = cc1;
    System.out.println(cuentaCorriente.type());

    /*
    Cast Explicito
    Aquí también podría ser explícito, pero nuevamente, el compilador no lo requiere porque cualquier CuentaCorriente
    es una Cuenta:
     */
    CuentaAhorros ca2 = new CuentaAhorros();
    Cuenta cuentaAhorros = (Cuenta) ca2;
    System.out.println(cuentaAhorros.type());

    List<CuentaAhorros> list = new ArrayList<>();

  }
}
