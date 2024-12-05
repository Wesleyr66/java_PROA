package atividadejava;

import java.util.Arrays;
import java.util.Scanner;

public class Atividade82 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner entrada = new Scanner(System.in);
        int soma = 0;
        for (int i = 0; i < 10; i++){
            System.out.println("Digite um valor: ");
            array[i] = entrada.nextInt();
            soma += array[i];
        }

        System.out.println(soma);
    }
}
