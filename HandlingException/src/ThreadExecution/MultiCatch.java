package ThreadExecution;

public class MultiCatch {


  public static void main(String[] args) {
    System.out.println("Inicio Main");
    methodMultiCatch();
    System.out.println("Fin Main");
  }



  /**
   * Este metodo contiene un multi catch.
   * con el uso de | se puede relacionar varias Exception dentro de un mismo catch.
   */
  private static void methodMultiCatch() {
    System.out.println("Inicio metodo MultiCatch");
    for (int i = 0; i < 2; i++) {
      System.out.println(i);
      try {
        int result = i / 0; //Division intensional entre 0 para provocar un ArithmeticException / by Zero
        if (i>1) {
          String text = null;
          System.out.println(text);   //Se genera intensaionalmente un NullPointerException / null
        }
        System.out.println(result);
      } catch (ArithmeticException | NullPointerException e) {
        e.printStackTrace();
        System.out.println(e.getMessage());
      }
    }
    System.out.println("Fin metodo MultiCatch");
  }

}
