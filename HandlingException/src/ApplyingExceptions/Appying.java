package ApplyingExceptions;

public class Appying {

  public static void main(String[] args) {
    Cuenta cuenta = new Cuenta();

    cuenta.setSaldo(200.0);

    System.out.println("Saldo en la cuenta antes del retiro: " + cuenta.getSaldo());

    try {
      cuenta.sacar(300.0);
    } catch (SaldoInsuficienteException ex) {
      System.out.println("Exception: " + ex.getMessage());
      ex.printStackTrace();
    }

    System.out.println("Saldo en la cuenta despues del retiro: " + cuenta.getSaldo());
  }
}
