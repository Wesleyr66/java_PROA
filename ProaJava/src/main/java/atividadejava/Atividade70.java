package atividadejava;

import java.util.Scanner;

public class Atividade70 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Numero:");
        int num = scan.nextInt();
        for (int cont =0;cont<=10;cont++){

            System.out.println(num+" X "+cont+" = "+ num*cont);
        }
    }
}
