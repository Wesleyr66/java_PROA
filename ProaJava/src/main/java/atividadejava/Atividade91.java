package atividadejava;

import java.util.Scanner;

public class Atividade91 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner entrada = new Scanner(System.in);
        int positivo = 0, somap = 0;
        int negativo = 0, soman = 0;
        for (int i = 0; i < 10; i++){
            System.out.println("Digite um valor: ");
            array[i] = entrada.nextInt();
            if (array[i] > 0){
                positivo++;
                somap+=array[i];
            }else if (array[i] < 0){
                negativo++;
                soman+=array[i];
            }
        }
        System.out.println(positivo+"/"+negativo);
        System.out.println(somap+"/"+soman);
    }
}
