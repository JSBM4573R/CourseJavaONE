package ApplyingExceptions;

public class Cuenta {

  private double saldo;

  public void sacar(double valor) throws SaldoInsuficienteException{

    if(this.saldo < valor) {
      throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
    }

    this.saldo -= valor;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }
}
