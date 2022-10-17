package WrappersClass;


public class UsingWrappers {

  /**
   * Uso de Wrappers
   * @param args
   */
  public static void main(String[] args) {

    /*
    Los Wrappers clases que contiene funcionalidades y encapsulan la variable de tipo primitivo.
    Wrappers: Double, Interger, Boolean, etc.
     */

    Double numeroDouble = 33.0; //Autobonxing

    Boolean verdadero = true; //Autobonxing

    Double IntToDouble = Double.valueOf(33); //Unbonxing

    Double StringToDouble = Double.valueOf("33"); //Unbonxing

    Integer StringToInteger = Integer.valueOf("44"); //Unbonxing


  }
}
