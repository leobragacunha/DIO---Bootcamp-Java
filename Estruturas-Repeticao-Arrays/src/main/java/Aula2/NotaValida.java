package Aula2;

import java.util.Scanner;

public class NotaValida {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        float nota = 0;

        System.out.println("Informe a nota do aluno:");
        nota = scan.nextFloat();

        while(nota<0 || nota>10){

            System.out.println("Informe um valor válido: ");
            nota = scan.nextFloat();

        }




    }



}
