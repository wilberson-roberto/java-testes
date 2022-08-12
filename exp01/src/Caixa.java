public class Caixa {
    public double saldo = 2500;

    public void sacar(double saldo) {
        this.saldo -= saldo;
    }

    public void depositar(double saldo) {
        this.saldo += saldo;
    }

    public double extrato() {
        return saldo;
    }
}
