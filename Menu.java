package Mentorama.DesafioMod8;
import Mentorama.DesafioMod8.DB.ContasDB;
import Mentorama.DesafioMod8.Models.*;

import java.util.Scanner;

public class Menu {
    static ContasDB contasDB = new ContasDB();

    public static void main(String[] args) throws Exception {
        int option;

        System.out.println("--- Gerenciamento de Contas ---");

        do{
            System.out.println("---------------------------------");
            System.out.println("1 - Cadastrar Conta Corrente");
            System.out.println("2 - Cadastrar Conta Salario");
            System.out.println("3 - Cadastrar Conta Poupança");
            System.out.println("4 - Relatório de contas");
            System.out.println("0 - Sair");
            System.out.println("---------------------------------");

            System.out.print("Selecione uma opção: ");
            Scanner entrada = new Scanner(System.in);
            option = entrada.nextInt();

            process(option);

        } while (option != 0);
    }

    public static void process(int option) throws Exception {
        switch (option) {
            case 1: {
                System.out.println("Cadastro de Conta Corrente");
                System.out.println("--------------------------");

                Scanner entrada = new Scanner(System.in);

                System.out.print("Nome do banco: ");
                String banco = entrada.next();

                System.out.print("Numero da agência: ");
                int numeroAgencia = entrada.nextInt();

                System.out.print("Numero da conta: ");
                int numeroConta = entrada.nextInt();

                System.out.print("Saldo inicial: R$");
                double saldo = entrada.nextDouble();

                System.out.print("Limite a ser liberado: R$");
                double limite = entrada.nextDouble();

                ContaCorrente novaContaCorrente = new ContaCorrente(banco, numeroAgencia, numeroConta, saldo, limite);
                contasDB.addNovaConta(novaContaCorrente);

                break;
            }

            case 2: {
                System.out.println("Cadastro de Conta Salario");
                System.out.println("-------------------------");

                Scanner entrada = new Scanner(System.in);

                System.out.print("Nome do banco: ");
                String banco = entrada.next();

                System.out.print("Numero da agência: ");
                int numeroAgencia = entrada.nextInt();

                System.out.print("Numero da conta: ");
                int numeroConta = entrada.nextInt();

                System.out.print("Saldo inicial: R$");
                double saldo = entrada.nextDouble();

                System.out.print("Limite de saques: ");
                int limiteSaques = entrada.nextInt();

                ContaSalario novaContaSalario = new ContaSalario(banco, numeroAgencia, numeroConta, saldo, limiteSaques);
                contasDB.addNovaConta(novaContaSalario);

            }

            case 3: {
                System.out.println("Cadastro de Conta Salario");
                System.out.println("-------------------------");

                Scanner entrada = new Scanner(System.in);

                System.out.print("Nome do banco: ");
                String banco = entrada.next();

                System.out.print("Numero da agência: ");
                int numeroAgencia = entrada.nextInt();

                System.out.print("Numero da conta: ");
                int numeroConta = entrada.nextInt();

                System.out.print("Saldo inicial: R$");
                double saldo = entrada.nextDouble();

                System.out.print("Rendimento da conta: ");
                double rendimento = entrada.nextDouble();

                ContaPoupanca novaContaPoupanca = new ContaPoupanca(banco, numeroAgencia, numeroConta, saldo, rendimento);
                contasDB.addNovaConta(novaContaPoupanca);
            }

            case 4: {
                System.out.println("--- Relatório de contas ---");
                System.out.println("---------------------------");

                for(Conta conta : contasDB.getContasList()) {
                    System.out.println("Banco: " + conta.getNomeBanco());
                    System.out.println("Numero da agência: " + conta.getNumeroAgencia());
                    System.out.println("Numero da Conta: " + conta.getNumeroConta());
                    System.out.println("Saldo da conta: " + conta.getSaldo());
                    System.out.println("Tipo da conta: " + conta.getTipoConta());
                    System.out.println("-------------------------------------");
                }
                break;
            }
        }
    }
}
