package Aula3;

import java.util.Scanner;

public class OrdemInversa {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] vetor = new int[6];

        for (int j=0; j<6 ;j++){
            System.out.println("Posição " + j + ": ");
            vetor[j]= scan.nextInt();
        }

        for (int i=vetor.length-1; i>=0; i--){
            System.out.println(vetor[i]);
        }


    }


}
