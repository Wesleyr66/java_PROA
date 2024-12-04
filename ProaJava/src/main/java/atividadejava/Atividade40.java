package atividadejava;

import java.util.Scanner;

public class Atividade40 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cont =0;

        System.out.println("Numero:");
        int num = scan.nextInt();
        while (cont<=10){

            System.out.println(num+" X "+cont+" = "+ num*cont);
            cont++;
        }
    }
}
