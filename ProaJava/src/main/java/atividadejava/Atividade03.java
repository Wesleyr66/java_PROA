package atividadejava;

import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float base,altura;

        System.out.println("Entre com a base do triangulo:");
        base = scan.nextFloat();
        System.out.println("Entre com a altura do triangulo:");
        altura = scan.nextFloat();

        System.out.println("A area do triangulo é:" + (base*altura)/2);
    }
}
