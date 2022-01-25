package entendendo.motodos.java.aula2;

public class Programa {

    public static void main(String[] args) {

       Quadrilatero quadrilatero = new Quadrilatero();

       System.out.println("Área do quadrado: " + quadrilatero.Area(4));
       System.out.println("Área do retângulo: " + quadrilatero.Area(4, 8));
       System.out.println("Área do trapézio: " + quadrilatero.Area(4, 8, 2));

    }

}
