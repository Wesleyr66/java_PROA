package atividadejava;

import java.util.Scanner;

public class Atividade22 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Salario");
        float slr = scan.nextFloat();

        if (slr>2000){
            System.out.println(slr*1.1);
        }else {
            System.out.println(slr*1.05);
        }

    }
}
