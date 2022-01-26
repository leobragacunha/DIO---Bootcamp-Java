import java.util.Random;

public abstract class Conta implements OperaConta {

    private final int AGENCIA_PADRAO = 1;
    private static int NUMERO_CONTA = 1;
    private int agencia;
    private double saldo;
    private int numero;
    Cliente cliente;


    Conta (Cliente cliente){
        this.agencia = AGENCIA_PADRAO;
        this.saldo = saldo;
        this.numero = NUMERO_CONTA++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double saque) {
        this.saldo -= saque;
    }

    @Override
    public void depositar(double deposito) {
        this.saldo += deposito;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public void dadosTitular(){
        System.out.println("Dados do titular: ");
        System.out.println(String.format("Nome: %s", this.cliente.getNome()));
        System.out.println(String.format("CPF: %s", this.cliente.getCpf()));
        System.out.println("Data de nascimento: "+ this.cliente.getDataNascimento());
        System.out.println(String.format("Endereço: %s", this.cliente.getEndereco()));
    }

    @Override
    public void extrato() {

        System.out.println(String.format("Agência: %d", agencia));
        System.out.println(String.format("Conta: %d", numero));
        System.out.println(String.format("Saldo: R$%.2f \n\n", saldo));
    }





}
