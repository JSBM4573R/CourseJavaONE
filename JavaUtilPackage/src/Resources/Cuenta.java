package Resources;

public abstract class Cuenta implements Comparable<Cuenta> {

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

  @Override
  public int compareTo(Cuenta o) {
    Integer thisNumberCast = Integer.valueOf(this.number);
    Integer numberOCast = Integer.valueOf(o.getNumber());
    return Integer.compare(thisNumberCast, numberOCast);
  }
}
