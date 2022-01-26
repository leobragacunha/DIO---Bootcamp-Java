import java.time.LocalDate;

public class Cliente {

    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private String endereco;

    Cliente(String nome, String cpf, int dia, int mes, int ano, String endereco){
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = LocalDate.of(1995, 10, 27);
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }



}
