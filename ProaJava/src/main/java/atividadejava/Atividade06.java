package atividadejava;

import java.util.Scanner;

public class Atividade06 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        float num;

        System.out.println("Entre com numero:");
        num = scan.nextFloat();

        if (num%2 == 0){
            System.out.println("num é par");
        }else {
            System.out.println("num é impar");
        }


    }
}
