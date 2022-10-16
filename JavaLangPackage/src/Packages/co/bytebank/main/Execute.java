package Packages.co.bytebank.main;

import Packages.com.bytebank.model.Account;
import Packages.com.bytebank.model.User;

public class Execute {

  /**
   * Contiene un ejemplo del el uso de import e instancias de una clase, además del uso y creacion de subpaquetes.
   * Se puede importar completamente el contenido de un paquete usando * (Packages.com.bytebank.model.*)
   * Por organización y por la convención adoptada, debemos seguir el dominio de la empresa. Es decir,
   * si la empresa tiene el dominio alura.com.br, los paquetes deben ser subpaquetes de br.com.alura.
   * @param args
   */
  public static void main(String[] args) {

    //Instancia de clase incluyendo parametros para su creacion
    User userOne = new User("Juan Sebastian", "juan@gmail.com", "234234");
    User userTwo = new User("Maria Paula", "maria@gmail.com", "345345");

    //Primera manera que importa una clase con la palabra import (Esta es la más usada y se genera automaticamente)
    Account accountOne = new Account();

    //Segunda manera de importar una clase dentro del scope
    //Esta manera puede ser usada para especificar archivos entre packages
    Packages.com.bytebank.model.Account accountTwo = new Packages.com.bytebank.model.Account();

    //Seteo cuenta uno
    accountOne.setStatus(true);
    accountOne.setUser(userOne);

    //Seteo cuenta dos
    accountTwo.setStatus(false);
    accountTwo.setUser(userTwo);

    //Validar cuentas
    validar(accountOne.isStatus(), userOne);
    validar(accountTwo.isStatus(), userTwo);
  }

  /**
   * Valida el status de una cuenta para saber si esta activa.
   * @param status
   * @param user
   */
  private static void validar(boolean status, User user) {
    if(status) {
      System.out.println("la cuenta de: "+user.getName()+" esta activa");
    } else {
      System.out.println("la cuenta de: "+user.getName()+" esta inactiva");
    }
  }
}
