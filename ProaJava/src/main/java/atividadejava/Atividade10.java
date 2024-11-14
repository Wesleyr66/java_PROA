package atividadejava;

import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float num;
        System.out.println("Digite um num: ");
        num = scan.nextFloat();

        for (int i=1; i<=10;i++ ){
            System.out.println(num +" X "+ i +" = "+ num*i);
        }
    }
}
