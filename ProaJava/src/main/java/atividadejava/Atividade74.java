package atividadejava;

import java.util.Scanner;

public class Atividade74 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int totalIdades = 0;

        for (int contador = 0;contador < 5;contador++) {
            System.out.print("Digite o nome da pessoa " + (contador + 1) + ": ");
            String nome = scan.nextLine();

            System.out.print("Digite a idade de " + nome + ": ");
            int idade = scan.nextInt();
            scan.nextLine();

            totalIdades += idade;
        }

        double mediaIdades = totalIdades / 5.0;
        System.out.printf("\nA média das idades das 5 pessoas é: %.2f anos.\n", mediaIdades);

    }
}
