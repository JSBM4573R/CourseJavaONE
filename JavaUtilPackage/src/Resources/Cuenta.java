package Resources;

public abstract class Cuenta {

  private String number;

  public abstract String type();

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public boolean esIgual(Cuenta cuenta) {
    return this.number == cuenta.getNumber();
  }

  @Override
  public boolean equals(Object obj) {
    Cuenta cuenta = (Cuenta) obj;
    return this.number == cuenta.getNumber();
  }

  @Override
  public String toString() {
    return "Cuenta{" +
        "number='" + number + '\'' +
        '}';
  }
}
