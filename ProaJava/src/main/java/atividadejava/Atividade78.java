package atividadejava;

import java.util.Scanner;

public class Atividade78 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Numero:");
        String num = scan.next();

        for (int i=0;i<num.length();i++){
            System.out.println(num.charAt(i));
        }
    }
}
