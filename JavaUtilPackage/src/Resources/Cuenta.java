package Resources;

public abstract class Cuenta implements Comparable<Cuenta> {

  private String number;

  private double saldo;

  public abstract String type();

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
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
        ", saldo=" + saldo +
        '}';
  }

  @Override
  public int compareTo(Cuenta o) {
    return Double.compare(this.saldo, o.getSaldo());
  }
}
