package StackExecution;

public class Flow {

  public static void main(String[] args) {
    System.out.println("Inicio del main");
    metodoUno();
    System.out.println("Fin del main");
  }

  private static void metodoUno() {
    System.out.println("Inicio del metodoUno");
    metodoDos();
    System.out.println("Fin del metodoUno");
  }

  private static void metodoDos() {
    System.out.println("Inicio del metodoDos");
    for (int i = 1; i <= 5; i++) {
      System.out.println(i);
    }
    System.out.println("Fin del metodoDos");
  }

}
