package Aula3;

import java.util.Random;

public class MatrizOrdem4 {

    public static void main(String[] args) {

        Random random = new Random();
        int[][] matriz = new int[4][4];

        /*for (int i=0; i<4; i++){
            for (int j=0; j<4; j++){
                matriz[i][j] = random.nextInt(9);
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.print("\n");
        }*/

        for (int[] linha : matriz ){
            for (int numero: linha){
                numero = random.nextInt(9);
                System.out.print(numero + "\t");
            }
        System.out.print("\n");
        }


    }


}
