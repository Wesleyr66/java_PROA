package atividadejava;

import java.util.Scanner;

public class Atividade109 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("[%d][%d]: ", i, j);
                matriz[i][j] = scanner.nextInt();
            }
        }

        int cont = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j && matriz[i][j] != 1) {
                    cont++;
                    break;
                } else if (i != j && matriz[i][j] != 0) {
                    cont++;
                    break;
                }
            }
        }

        System.out.println("\nMatriz inserida:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }


        if (cont==0) {
            System.out.println("\nA matriz é uma matriz identidade.");
        } else {
            System.out.println("\nA matriz não é uma matriz identidade.");
        }
    }
}
