package atividadejava;

import java.util.Scanner;

public class Atividade83 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner entrada = new Scanner(System.in);
        int soma = 0;
        for (int i = 0; i < 7; i++){
            System.out.println("Digite um valor: ");
            array[i] = entrada.nextInt();
            soma += array[i];
        }

        soma = soma / 7;
        System.out.println(soma);
    }
}
