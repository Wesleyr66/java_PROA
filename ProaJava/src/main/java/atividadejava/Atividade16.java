package atividadejava;

import java.util.Scanner;

public class Atividade16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero");
        float num = scan.nextFloat();

        if (num>0){
            System.out.println("positivo");
        } else if (num == 0) {
            System.out.println("é 0");
        }
        else {
            System.out.println("negativo");
        }
    }
}
