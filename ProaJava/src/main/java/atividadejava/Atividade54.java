package atividadejava;

import java.util.Scanner;

public class Atividade54 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cont = 0;
        int soma = 0;

        do{
            System.out.println("Qual a nota");
            soma += scan.nextInt();
            cont++;
        }while (cont<5);
        System.out.println(soma/5);
    }
}
