package Mentorama.DesafioMod8.Models;

public abstract class Conta {
    String nomeBanco;
    int numeroAgencia;
    int numeroConta;
    protected double saldo;
    private TipoConta tipoConta;

    public Conta(String nomeBanco, int numeroAgencia, int numeroConta, double saldo, TipoConta tipoConta) {
        this.nomeBanco = nomeBanco;
        this.numeroAgencia = numeroAgencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "nomeBanco='" + nomeBanco + '\'' +
                ", numeroAgencia=" + numeroAgencia +
                ", numeroConta=" + numeroConta +
                ", saldo=" + saldo +
                '}';
    }
}
