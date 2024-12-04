package atividadejava;

import java.util.Scanner;

public class Atividade48 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Numero:");
        String num = scan.next();

        int i=0;

        while (i<num.length()){
            System.out.println(num.charAt(i));
            i++;
        }
    }
}
