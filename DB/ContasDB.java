package Mentorama.DesafioMod8.DB;
import Mentorama.DesafioMod8.Models.Conta;

import java.util.ArrayList;
import java.util.List;

public class ContasDB {
    private List<Conta> contasList = new ArrayList<>();

    public List<Conta> getContasList() {
        return contasList;
    }

    public void addNovaConta(Conta conta) {
        int numeroConta = contasList.size() +1;
        conta.setNumeroConta(numeroConta);
        contasList.add(conta);
    }
}
