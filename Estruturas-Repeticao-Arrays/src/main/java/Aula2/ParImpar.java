package Aula2;

import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {

        int qtdenumeros;
        int i =0;

        int numero;
        int qtdepares = 0;
        int qtdeimpares = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de números que você deseja: ");
        qtdenumeros = scan.nextInt();

        while (i<qtdenumeros){

            System.out.println("Número " + (i+1) + ": ");
            numero = scan.nextInt();

            if (numero%2==0)
                qtdepares +=1;
            else
                qtdeimpares +=1;

            i++;
        }

        System.out.println("Você digitou " + qtdepares + " numeros pares e " + qtdeimpares + " numeros impares.");

    }

}
