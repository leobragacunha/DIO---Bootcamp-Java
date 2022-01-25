package tiposdedado;

public class TiposDado {

    public static void main(String[] args) {

        byte b1 = 10;
        byte b2 = 20;

        short s1 = 20000;
        //short s2 = 40000;     maior que o máximo permitido pelo short

        //int i1 = -10000000000;    menor que o mínimo permitido pelo int
        int i2 = 20500;

        long l1 = 1000000000000000000L;
        //long l2 = 305482400000000000000L; maior que o  máximo permitido pelo long

        float f1 = 382.5f;
        //float f2 = 382.5;     falta o f após o número

        double d1 = 98.37d;
        double d2 = 98.37;  //d opcional

        char c1 = 'W';
        //char c2 = "wW";   já é uma string
        char c3 = '\u0057'; //não é uma boa prática

        String str1 = "Fulano";
        String str2 = "Cicrano";

        boolean bool1 = true;
        boolean bool2 = false;


        System.out.println("b1: "+b1);
        System.out.println("b2: "+b2);
        System.out.println("s1: "+s1);
        System.out.println("i2: "+i2);
        System.out.println("l1: "+l1);
        System.out.println("f1: "+f1);
        System.out.println("d1: "+d1);
        System.out.println("d2: "+d2);
        System.out.println("c1: "+c1);
        System.out.println("c3: "+c3);
        System.out.println("str1: "+str1);
        System.out.println("str2: "+str2);
        System.out.println("bool1: "+bool1);
        System.out.println("bool2: "+bool2);

    }

}
