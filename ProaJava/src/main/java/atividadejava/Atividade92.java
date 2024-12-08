package atividadejava;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Atividade92 {
    public static void main(String[] args) {

        Integer[] array = new Integer[5];
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 5; i++){
            System.out.println("Digite um valor: ");
            array[i] = entrada.nextInt();
        }

        Arrays.sort(array, Collections.reverseOrder());
        System.out.println(Arrays.toString(array));
    }
}
