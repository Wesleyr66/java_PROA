package atividadejava;

import java.util.Scanner;

public class Atividade64 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("numero:");
        int num = scan.nextInt();

        int i=1,soma=1;
        do{
            soma*=i;
            i++;
        }while (i<=num);
        System.out.println(soma);
    }
}
