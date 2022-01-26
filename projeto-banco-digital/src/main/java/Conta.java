import java.util.Random;

public class GeraConta {


    private String tipoConta;       //C para corrente e P para poupança
    private int numeroConta = 0;        //gera 6 dígitos numéricos para a conta
    private String conta;           //concatena os dois
    private double saldo;

    Random random = new Random();

    protected String geraCorrente(){
        tipoConta = "C";

        while (numeroConta<100000){
        numeroConta = random.nextInt(999999);
        }

        numeroConta = toString();
        return tipoConta+conta;
    }

    protected String geraPoupanca(){
        tipoConta = "P";

        while (numeroConta<100000){
            numeroConta = random.nextInt(999999);
        }

        numeroConta = toString();
        return tipoConta+conta;
    }

    public double getSaldo() {
        this.saldo = saldo;
    }
}
