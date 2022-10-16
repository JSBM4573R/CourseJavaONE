package StringClass;

public class UsingStringBuilder {

  /**
   * Con tiene un ejemplo del uso de la Clase String y StringBuilder
   * @param args
   */
  public static void main(String[] args) {

    /*
    Concatenacion de un String con su metodo concat
     */
    String texto = "Ayuda";
    texto = texto.concat(" - ");
    texto = texto.concat("me ");
    texto = texto.concat("subi ");
    texto = texto.concat("en el ");
    texto = texto.concat("omnibus ");
    texto = texto.concat("equivocado ");
    System.out.println(texto);

    /*
    Uso de StringBuilder para armar un String con su metodo append
     */
    StringBuilder builder = new StringBuilder("Ayuda");
    builder.append(" - ");
    builder.append("me ");
    builder.append("subi ");
    builder.append("en el ");
    builder.append("omnibus ");
    builder.append("equivocado ");
    String textoDos = builder.toString();
    System.out.println(textoDos);
  }
}

