package atividadejava;

import java.util.Scanner;

public class Atividade49 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("numero:");
        int num = scan.nextInt();

        int i=1,soma=1;
        while (i<=num){
            soma*=i;
            i++;
        }
        System.out.println(soma);
    }
}
