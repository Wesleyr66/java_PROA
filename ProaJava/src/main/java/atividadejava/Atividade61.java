package atividadejava;

import java.util.Scanner;

public class Atividade61 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Numero:");
        int num = scan.nextInt();

        int i = 1,soma = 0;

        do{
            if (i%2==0){
                soma+=i;
                System.out.println(i);
            }
            i++;
        }while (i<=num);
        System.out.println(soma);
    }
}
