package atividadejava;

import java.util.Scanner;

public class Atividade07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float salario;

        System.out.println("Salario:");
        salario = scan.nextFloat();

        System.out.println("Salario liquido é:" + salario*1.05);
    }
}
