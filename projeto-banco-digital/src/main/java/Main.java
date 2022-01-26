public class Main {

    public static void main(String[] args) {
        Cliente leonardo = new Cliente("Leonardo Braga Cunha", "019.120.186.32", 27, 10, 1995, "Alameda Craveiros 81");
        Conta corrente = new ContaCorrente(leonardo);

        Cliente ines = new Cliente("Ines Grama Braga Cunha", "910.683.206-72", 06, 05, 1969, "Alameda Lotus, 92");
        Conta poupancaInes = new ContaPoupanca(ines);

        corrente.sacar(100);
        poupancaInes.depositar(1200);
        poupancaInes.transferir(200, corrente);

        corrente.extrato();
        poupancaInes.extrato();

    }

}
