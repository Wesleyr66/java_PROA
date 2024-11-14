package atividadejava;

import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero,numero2;
        System.out.println("Digite o numero 1:");
            numero=scan.nextInt();
        System.out.println("Digite o numero 2:");
            numero2=scan.nextInt();

        System.out.println(numero*numero2 + " Multiplicação");
        System.out.println(numero/numero2 + " Divisão");
        System.out.println(numero+numero2 + " Adição");
        System.out.println(numero-numero2 + " Subtração");
    }
}
