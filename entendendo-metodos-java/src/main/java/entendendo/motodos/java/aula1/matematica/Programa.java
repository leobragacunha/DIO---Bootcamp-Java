package entendendo.motodos.java.aula1.matematica;

public class Programa {

    public static void main(String[] args) {

        Operacoes opera = new Operacoes(5, 4);

        System.out.println("Confira as operações realizadas com "+opera.getA()+" e "+ opera.getB()+"\n");

        System.out.println("Soma: \t\t\t\t"+opera.Soma());
        System.out.println("Subtração:\t\t\t"+opera.Subtrai());
        System.out.println("Multiplicação:\t\t"+opera.Produto());
        System.out.println("Divisão:\t\t\t"+opera.Divide());

    }

}
