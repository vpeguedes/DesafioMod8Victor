package Mentorama.DesafioMod8.Models;

public class ContaPoupanca extends Conta{
    double rendimento;

    public ContaPoupanca(String banco, int numeroAgencia, int numeroConta, double saldo, double rendimento) {
        super(banco, numeroAgencia, numeroConta, saldo, TipoConta.CONTAPOUPANCA);
        this.rendimento = rendimento;
    }

    @Override
    public double getSaldo() {
        return this.saldo + (this.rendimento * saldo);
    }

    public double sacar(double valor) {
        setSaldo(getSaldo() - valor);
        return valor;
    }

    public double depositar(double valor) {
        setSaldo(getSaldo() + valor);
        return valor;
    }
}
