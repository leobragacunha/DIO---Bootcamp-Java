import java.time.LocalDateTime;

public class ContaPoupança extends Conta{

    private final String TIPO = "Poupança";

    @Override
    public void extrato() {
        System.out.println("===== Banco do Léo =====");
        System.out.println("Extrato do dia" + LocalDateTime.now());
        System.out.println("Conta: "+ TIPO);
        super.extrato();
    }

}
