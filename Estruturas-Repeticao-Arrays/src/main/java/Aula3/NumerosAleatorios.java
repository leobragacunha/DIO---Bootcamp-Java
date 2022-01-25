package Aula3;

import java.util.Random;

public class NumerosAleatorios {

    public static void main(String[] args) {

        Random random = new Random();

        int[] numerosAleatorios = new int[20];

       /* for(int i=0; i<numerosAleatorios.length; i++){

            numerosAleatorios[i] = random.nextInt(100);

            System.out.println("Número "+ (i+1) + ": " + numerosAleatorios[i] + "\t\t\tSucessor: "+(numerosAleatorios[i]+1));

        } */


        for (int numero : numerosAleatorios) {

            numero = random.nextInt(100);

            System.out.println("Número : " + numero + "\t\tSucessor: "+(numero+1));
        }
    }
}
