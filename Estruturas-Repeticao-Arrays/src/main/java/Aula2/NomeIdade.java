package Aula2;

import java.util.Scanner;

public class NomeIdade {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome = null;
        int idade = 0;

        while(true){

            System.out.println("Nome: ");
            nome = scan.next();

            if (nome.equals("0")){
                break;
            }

            System.out.println("Idade: ");
            idade = scan.nextInt();

        }

        System.out.println("O último nome registrado foi: " + nome);
        System.out.println("A última idade registrada foi: " + idade);
    }

}
