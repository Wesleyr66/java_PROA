package atividadejava;

import java.util.Scanner;

public class Atividade100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        int maior = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("[%d][%d]: ", i, j);
                matriz[i][j] = scanner.nextInt();

                if (i==0 && j==0){
                  maior = matriz[i][j];
                }

                if (maior<matriz[i][j]){
                    maior=matriz[i][j];
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println(); // Quebra de linha para próxima linha da matriz
        }
        System.out.println(maior);
    }
}
