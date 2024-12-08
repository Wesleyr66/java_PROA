package atividadejava;

import java.util.Arrays;
import java.util.Scanner;

public class Atividade95 {
    public static void main(String[] args) {
        String[] array = new String[7];
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 7; i++){
            System.out.println("Digite um nome: ");
            array[i] = entrada.next();
        }

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
