package atividadejava;

import java.util.Scanner;

public class Atividade23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("mes 1 a 12");
        int mes = scan.nextInt();

        int dias = 0;
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dias = 30;
                break;
            case 2:
                dias = 28; // Considerando um ano comum (não bissexto)
                break;
    }
        System.out.println("esse mes tem :" + dias +" dias");
}}

