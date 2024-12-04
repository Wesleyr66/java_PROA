package atividadejava;

import java.util.Scanner;

public class Atividade76 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Numero:");
        int num = scan.nextInt();

        int soma = 0;

        for (int i = 1;i<=num;i++){
            if (i%2==0){
                soma+=i;
                System.out.println(i);
            }
        }
        System.out.println(soma);
    }
}
