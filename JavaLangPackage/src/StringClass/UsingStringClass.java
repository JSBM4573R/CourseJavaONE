package StringClass;

public class UsingStringClass {

  /**
   * Contiene el uso de algunos metodos de la clase String
   * @param args
   */
  public static void main(String[] args) {

    //Despues de que el String declarado es guardado en el Garbage Collector este se vuelve inmutable
    String name = "juan";

    //Otra forma de crear un string
    String nameTwo = new String("juan");

    name.replace("j", "J");
    name.concat(" Sebastian");

    System.out.println(name);

    //Para poder modificar el String se puede sobreescribir la variable
    nameTwo = nameTwo.replace("j", "J");
    nameTwo = nameTwo.concat(" Sebastian");
    nameTwo = nameTwo.toUpperCase();
    int index = nameTwo.indexOf("A");
    int length = nameTwo.length();

    System.out.println(nameTwo);
    System.out.println("Indice encontrado de la letra 'A' es: "+index+" Dentro del String: "+nameTwo);
    System.out.println("El tamaño de la palabra: "+nameTwo+" es: "+length);
  }
}
