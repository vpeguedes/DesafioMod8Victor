package Mentorama.DesafioMod8.Models;

public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(String banco, int numeroAgencia, int numeroConta, double saldo, double limite) {
        super(banco, numeroAgencia, numeroConta, saldo, TipoConta.CONTACORRENTE);
        this.limite = limite;
    }

    @Override
    public double getSaldo() {
        return this.limite + this.saldo;
    }

    private double getLimite() {
        if(getSaldo() < 0) {
            return limite - Math.abs(getSaldo());
        } else {
            return limite;
        }
    }

    public double sacar(double valor) {
        System.out.println("Valor do saque: R$" + valor);
        if(valor <= (getSaldo() + limite)) {
            setSaldo(getSaldo() - valor);
            System.out.println("Saldo atual: R$" + getSaldo());

            if(getSaldo() < 0) {
                System.out.println("Valor restante do cheque especial: R$" + getLimite());
            }
            return valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
        return 0.0;
    }
}
