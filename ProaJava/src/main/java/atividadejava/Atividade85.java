package atividadejava;

import java.util.Scanner;

public class Atividade85 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner entrada = new Scanner(System.in);
        int maior = 0,menor = 0;
        for (int i = 0; i < 5; i++){
            System.out.println("Digite um valor: ");
            array[i] = entrada.nextInt();

            if (i==0) {
                menor = array[0];
                maior = array[0];
            }
            if (menor>array[i]){
                menor = array[i];
            }
            if (maior<array[i]){
                maior = array[i];
            }

        }
        System.out.println("menor: "+ menor +" maior: "+ maior);
    }
}
