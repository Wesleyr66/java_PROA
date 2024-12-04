package atividadejava;

import java.util.Scanner;

public class Atividade79 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("numero:");
        int num = scan.nextInt();

        int soma=1;
        for (int i=1;i<=num;i++){
            soma*=i;
        }
        System.out.println(soma);
    }
}
