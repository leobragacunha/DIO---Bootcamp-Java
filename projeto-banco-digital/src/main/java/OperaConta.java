public interface OperaConta {

    void sacar(double saque);

    void depositar(double deposito);

    void transferir(double valor, Conta conta);

    void extrato();

}
