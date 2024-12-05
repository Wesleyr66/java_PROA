package atividadejava;

import java.util.Scanner;

public class Atividade89 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner entrada = new Scanner(System.in);
        int positivo = 0;
        int negativo = 0;
        for (int i = 0; i < 10; i++){
            System.out.println("Digite um valor: ");
            array[i] = entrada.nextInt();
            if (array[i] > 0){
                positivo++;
            }else if (array[i] < 0){
                negativo++;
            }
        }
        System.out.println(positivo+"/"+negativo);
    }
}
