package WrappersClass;

public class UnBoxing {

  /**
   * Contiene un Wrapper de tipo UnBoxing
   * @param args
   */
  public static void main(String[] args) {

    //Wrapper
    Integer numeroObjeto = Integer.valueOf(40);
    //Conversion de un Integer a un primitivo con el metodo .intValue
    int valorPrimitivo = numeroObjeto.intValue();

    System.out.println(valorPrimitivo);
  }
}
