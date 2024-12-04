package atividadejava;

import java.util.Scanner;

public class Atividade39 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cont = 0;
        int soma = 0;

        while (cont<5){
            System.out.println("Qual a nota");
            soma += scan.nextInt();
            cont++;
        }
        System.out.println(soma/5);
    }
}
