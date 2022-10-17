package WrappersClass;

import java.util.ArrayList;
import java.util.List;

public class AutoBoxing {

  /**
   * Contiene un Wrapper de tipo autobonxing
   * @param args
   */
  public static void main(String[] args) {

    int numero = 3;

    //Integer numeroObjeto = new Integer(3); //Metodo Deprecado

    //Wrapper
    Integer numeroObjeto = Integer.valueOf(40);

    //El Generic solo acepta un Objeto no acepta primitivos
    List<Integer> lista = new ArrayList<>();
    lista.add(numero);  //Autoboxing
    lista.add(Integer.valueOf(33)); //Por debajo Java genera esta conversion para los primitivos, esto se llama Autoboxing
    lista.add(numeroObjeto);

    System.out.println(lista);

  }
}
