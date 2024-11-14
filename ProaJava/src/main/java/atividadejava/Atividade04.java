package atividadejava;

import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float nota,nota2,nota3;

        System.out.println("Entre com a nota 1:");
        nota = scan.nextFloat();
        System.out.println("Entre com a nota 2:");
        nota2 = scan.nextFloat();
        System.out.println("Entre com a nota 3:");
        nota3 = scan.nextFloat();

        System.out.println("A nota final é:" + ((nota*2)+(nota2*3)+(nota3*5))/10);
    }
}
