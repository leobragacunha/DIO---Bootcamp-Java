package Aula2;

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {

        int numero=0;
        int soma=1;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número do qual deseja o fatorial: ");
        numero = scan.nextInt();

        System.out.println("Fatorial do "+ numero);

        for (int i=numero; i>0; i--){
            soma = soma * i;
            System.out.println(numero + " * " + i + " = " + numero*i);
        }

        System.out.println(numero + "! =" + soma);

    }



}
