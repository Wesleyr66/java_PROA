package atividadejava;

import java.util.Scanner;

public class Atividade31 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual seu salario:");
        float slr = scan.nextFloat();

        float capita = slr/1500;

        System.out.println(String.format("%.2f", capita));
    }
}
