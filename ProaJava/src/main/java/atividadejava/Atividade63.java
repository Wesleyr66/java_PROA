package atividadejava;

import java.util.Scanner;

public class Atividade63 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Numero:");
        String num = scan.next();

        int i=0;

        do{
            System.out.println(num.charAt(i));
            i++;
        }while (i<num.length());
    }
}
