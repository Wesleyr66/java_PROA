package atividadejava;

import java.util.Scanner;

public class Atividade58 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("numero:");
        int num = scan.nextInt();

        int fibo1 = 0,fibo2 = 1;

        do{
            System.out.println(fibo1);
            fibo1+=fibo2;
            System.out.println(fibo2);
            fibo2+=fibo1;
        }while (fibo1<num || fibo2 < num);
    }
}