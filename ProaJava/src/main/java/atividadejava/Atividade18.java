package atividadejava;

import java.util.Scanner;

public class Atividade18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("num");
        float num = scan.nextFloat();

        System.out.println("num");
        float num2 = scan.nextFloat();

        if (num>num2){
            System.out.println(num + "É maior");
        }else {
            System.out.println(num2 + "É maior");
        }
    }
}
