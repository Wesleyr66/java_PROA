package atividadejava;

import java.util.Scanner;

public class Atividade20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("num");
        float num = scan.nextFloat();

        if (num%2==0){
            System.out.println("Par");
        }else {
            System.out.println("Impar");
        }
    }

}
