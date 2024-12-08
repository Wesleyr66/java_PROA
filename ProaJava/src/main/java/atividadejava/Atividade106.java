package atividadejava;

import java.util.Scanner;

public class Atividade106 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] matriz1 = new int[2][2];
        int[][] matriz2 = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("[%d][%d]: ", i, j);
                matriz1[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("[%d][%d]: ", i, j);
                matriz2[i][j] = scanner.nextInt();
            }
        }


        int cont = 0;
        for (int i = 0; i < 2; i++) {

            for (int i2 = 0; i2 < 2; i2++) {

                if (matriz1[i][i2] != matriz2[i][i2]) {
                    cont++;
                }
            }
        }



        if(cont>0){
            System.out.println("são diferentes");
        }
        else{
            System.out.println("são iguais");
        }
    }
}
