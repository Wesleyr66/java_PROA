package atividadejava;

import java.util.Scanner;

public class Atividade08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero,numero2,numero3;
        System.out.println("Digite o numero 1:");
        numero=scan.nextInt();
        System.out.println("Digite o numero 2:");
        numero2=scan.nextInt();

        numero3 = numero;
        numero = numero2;
        numero2 = numero3;



        System.out.println(numero + " e " + numero2 );

    }
}
