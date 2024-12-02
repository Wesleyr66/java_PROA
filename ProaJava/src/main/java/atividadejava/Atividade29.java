package atividadejava;

import java.util.Scanner;

public class Atividade29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o nome:");
        String nome = scan.next();
        System.out.println("Entre com a nota 1:");
        float nota = scan.nextFloat();
        System.out.println("Entre com a nota 2:");
        float nota2 = scan.nextFloat();
        System.out.println("Entre com a nota 3:");
        float nota3 = scan.nextFloat();

        nota = (nota+nota2+nota3)/3;

        if (nota<7){
            System.out.println(nome + "Reprovado");
        }else {
            System.out.println(nome + "Aprovado");
        }
        
    }
}
