package entendendo.motodos.java.aula1.emprestimo;

public class Emprestimo {

    private double montante;

    public Emprestimo(double montante){
        this.montante = montante;
    }

    public double TaxaBaixa(){
        return montante * 0.01;
    }

    public double TaxaMedia(){
        return montante * 0.05;
    }

    public double TaxaAlta(){
        return montante * 0.09;
    }

    public void selecionaTaxa(){
        if(montante<100000.0){
            //Taxa Alta
            System.out.println("Os juros do seu empréstimo serão de 9% a.m. \nA prestação do seu empréstimo será de R$"+TaxaAlta());
        } else if (montante < 500000.0) {
            //Taxa Média
            System.out.println("Os juros do seu empréstimo serão de 5% a.m. \nA prestação do seu empréstimo será de R$"+TaxaMedia());
        } else {
            //Taxa Baixa
            System.out.println("Os juros do seu empréstimo serão de 1% a.m. \nA prestação do seu empréstimo será de R$"+TaxaBaixa());
        }
    }

    public static void main(String[] args) {

        Emprestimo emprestimo = new Emprestimo(780000.0);
        emprestimo.selecionaTaxa();

    }

}
