package Resources;

public class CuentaCorriente extends Cuenta {

  @Override
  public String type() {
    return new String("Cuenta Corriente");
  }
}
