package atividadejava;

import java.util.Scanner;

public class Atividade25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Faltas");
        int falta = scan.nextInt();

        if (falta>15){
            System.out.println("Reprovado");
        }else {
            System.out.println("ta suave");
        }
    }
}
