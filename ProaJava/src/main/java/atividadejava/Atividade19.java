package atividadejava;

import java.util.Scanner;

public class Atividade19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float nota,nota2,nota3;

        System.out.println("Entre com a nota 1:");
        nota = scan.nextFloat();
        System.out.println("Entre com a nota 2:");
        nota2 = scan.nextFloat();
        System.out.println("Entre com a nota 3:");
        nota3 = scan.nextFloat();

        nota = (nota+nota2+nota3)/3;

        if (nota<7){
            System.out.println("Reprovado");
        }else {
            System.out.println("Aprovado");
        }
    }
}
