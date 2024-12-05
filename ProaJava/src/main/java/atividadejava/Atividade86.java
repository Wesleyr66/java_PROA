package atividadejava;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Atividade86 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner entrada = new Scanner(System.in);
        int soma = 0;
        for (int i = 0; i < 10; i++){
            System.out.println("Digite um valor: ");
            array[i] = entrada.nextInt();
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
