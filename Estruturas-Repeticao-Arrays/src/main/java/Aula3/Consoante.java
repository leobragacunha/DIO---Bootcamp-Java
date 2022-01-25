package Aula3;

import java.util.Scanner;

public class Consoante {

    public static void main(String[] args) {

        String texto;
        int consoante = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o texto a ser analizado");
        texto = scan.nextLine();

        for(int i = 0; i< texto.length(); i++){

            if (!(texto.charAt(i)=='a' || texto.charAt(i)=='A'
                || texto.charAt(i)=='e' || texto.charAt(i)=='E'
                || texto.charAt(i)=='i' || texto.charAt(i)=='I'
                || texto.charAt(i)=='o' || texto.charAt(i)=='O'
                || texto.charAt(i)=='u' || texto.charAt(i)=='U' || texto.charAt(i) ==' ')){
                consoante++;
            }
        }

        System.out.println("Temos "+ consoante + " consoantes nessa string");


    }


}
