package atividadejava;

import java.util.Scanner;

public class Atividade34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        int idade = scan.nextInt();

        if (idade < 16) {
            System.out.println("Não pode votar.");
        } else if ((idade >= 18 && idade <= 70)) {
            System.out.println("Voto obrigatório.");
        } else {
            System.out.println("Voto facultativo.");
        }
    }
}
