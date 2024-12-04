package atividadejava;

import java.util.Scanner;

public class Atividade55 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cont =0;

        System.out.println("Numero:");
        int num = scan.nextInt();
        do{

            System.out.println(num+" X "+cont+" = "+ num*cont);
            cont++;
        }while (cont<=10);
    }
}
