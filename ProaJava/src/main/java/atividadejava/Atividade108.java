package atividadejava;

import java.util.Scanner;

public class Atividade108 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][4];

        int soma = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("[%d][%d]: ", i, j);
                matriz[i][j] = scanner.nextInt();

            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < 4; i++) {
            soma = 0;
            for (int j = 0; j < 4; j++) {
                soma += matriz[i][j];
            }

            System.out.println(soma);
        }
    }
}
