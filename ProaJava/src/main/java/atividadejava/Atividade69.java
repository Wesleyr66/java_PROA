package atividadejava;

import java.util.Scanner;

public class Atividade69 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int soma = 0;

        for (int cont = 0;cont<5;cont++){
            System.out.println("Qual a nota");
            soma += scan.nextInt();
        }
        System.out.println(soma/5);
    }
}
