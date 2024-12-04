package atividadejava;

import java.util.Scanner;

public class Atividade59 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int totalIdades = 0;
        int contador = 0;

        do {
            System.out.print("Digite o nome da pessoa " + (contador + 1) + ": ");
            String nome = scan.nextLine();

            System.out.print("Digite a idade de " + nome + ": ");
            int idade = scan.nextInt();
            scan.nextLine();

            totalIdades += idade;
            contador++;
        }while (contador < 5);

        double mediaIdades = totalIdades / 5.0;
        System.out.printf("\nA média das idades das 5 pessoas é: %.2f anos.\n", mediaIdades);

    }
}
