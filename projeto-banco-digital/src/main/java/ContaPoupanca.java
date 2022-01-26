import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ContaPoupanca extends Conta{

    private final String TIPO = "Poupança";
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy hh:mm");

    ContaPoupanca(Cliente cliente) {
        super(cliente);
    }


    @Override
    public void extrato() {
        System.out.println("===== Banco do Léo =====");
        System.out.println("Extrato do dia " + LocalDateTime.now().format(formatter));
        super.dadosTitular();
        System.out.println("Conta: "+ TIPO);
        super.extrato();
    }

}
