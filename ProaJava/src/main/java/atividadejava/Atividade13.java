package atividadejava;

import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("numero");
        float num1 = scan.nextFloat();

        System.out.println("numero");
        float num2 = scan.nextFloat();

        if (num2%num1==0){
            System.out.println("É divi");
        }else {
            System.out.println("não é divi");
        }
    }
}
