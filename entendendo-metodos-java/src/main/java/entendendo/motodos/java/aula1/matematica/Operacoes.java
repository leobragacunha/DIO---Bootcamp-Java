package entendendo.motodos.java.aula1.matematica;

public class Operacoes {

    private double a;
    private double b;

    public Operacoes(double a, double b){
        this.a = a;
        this.b = b;
    }

    public double Divide() {
        double divisao = a / b;
        return divisao;
    }

    public double Produto() {
        double produto = a * b;
        return produto;
    }

    public double Subtrai() {
        double subtrai = a - b;
        return subtrai;
    }

    public double Soma() {
        double soma = a + b;
        return soma;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}
