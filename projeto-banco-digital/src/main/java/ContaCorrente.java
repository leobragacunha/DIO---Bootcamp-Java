import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ContaCorrente extends Conta{

    private final String TIPO = "Corrente";
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy hh:mm");

    public ContaCorrente(Cliente cliente) {
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
