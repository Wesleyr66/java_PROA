package atividadejava;

import java.util.Arrays;
import java.util.Scanner;

public class Atividade94 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner entrada = new Scanner(System.in);
        int par = 0;
        for (int i = 0; i < 10; i++){
            System.out.println("Digite um valor: ");
            array[i] = entrada.nextInt();

            if (array[i]%2==0){
                par++;
            }
        }
        System.out.println(par);
    }
}