package atividadejava;

import java.util.Scanner;

public class Atividade35 {
    public static void main(String[] args) {


    Scanner scan = new Scanner(System.in);

        System.out.print("Digite o número: ");
    int numero1 = scan.nextInt();

        System.out.print("Digite o número: ");
    int numero2 = scan.nextInt();

        System.out.print("Digite o número: ");
    int numero3 = scan.nextInt();

    float media = (numero1 + numero2 + numero3) / 3;

        System.out.println("Média: "+media);

        if(media >=7) {
        System.out.println("Aprovado");
    } else

    {
        System.out.println("Reprovado");
    }

}}
