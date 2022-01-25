package Aula2;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {

        int numero=0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número do qual deseja a tabuada: ");
        numero = scan.nextInt();

        while(numero<0 || numero>10){
            System.out.println("Digite um número valido!");
            numero = scan.nextInt();
        }

        System.out.println("Tabuada do "+ numero);

        for (int i=1; i<11; i++){
            System.out.println(numero + " * " + i + " = " + numero*i);
        }

    }


}
