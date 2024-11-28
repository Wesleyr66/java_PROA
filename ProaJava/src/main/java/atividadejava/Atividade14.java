package atividadejava;

import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos anos");
        int ano = scan.nextInt();

        System.out.println("Quantos meses");
        int mes = scan.nextInt();

        System.out.println("Quantos dias");
        int dia = scan.nextInt();

        ano = ano*365;
        mes = mes*30;

        System.out.println((ano+mes+dia));
    }
}
