package Mentorama.DesafioMod8.Models;

public class ContaSalario extends Conta{
    int limiteSaques;

    public ContaSalario(String banco, int numeroAgencia, int numeroConta, double saldo, int limiteSaques) {
        super(banco, numeroAgencia, numeroConta, saldo, TipoConta.CONTASALARIO);
        this.limiteSaques = limiteSaques;
    }

    @Override
    public double getSaldo() {
        return this.saldo;
    }

    public double sacar(double valor) {
        if(limiteSaques == 0) {
            System.out.println("Limite de saques excedido");
        } else {
            System.out.println("Saques disponiveis: " + limiteSaques);
            this.limiteSaques --;
            this.saldo -= valor;
        }

        return 0.0;
    }

    public double depositar(double valor) {
        setSaldo(getSaldo() + valor);
        return valor;
    }
}
