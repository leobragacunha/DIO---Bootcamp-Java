package Aula2;

import java.util.Scanner;

public class Maior {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero = 0;
        int maior = 0;
        int i = 1;
        int soma = 0;
        int media;

        System.out.println("Digite 5 numeros: ");

        do{

            System.out.println("Número "+ i +": ");
            numero = scan.nextInt();
            soma +=numero;

            if (numero > maior)
                maior = numero;

            i++;
        } while (i<6);

        media = soma/5;

        System.out.println("O maior numero é: "+ maior);
        System.out.println("A média desse números é: "+ media);

    }



}
