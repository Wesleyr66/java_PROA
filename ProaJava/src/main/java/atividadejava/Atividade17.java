package atividadejava;

import java.util.Scanner;

public class Atividade17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Idade");
        int idade = scan.nextInt();

        if (idade<18){
            System.out.println("criança");
        } else if (idade<65) {
            System.out.println("Adulto");
        }else {
            System.out.println("Idoso");
        }
    }
}
