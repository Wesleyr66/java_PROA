package atividadejava;

import java.util.Scanner;

public class Atividade50 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;
        int soma = 0;
        int i = 0;

        while (true) {
            System.out.print("Digite o nome da pessoa 'fim': ");
            nome = scan.nextLine();

            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.print("Digite a idade ");
            idade = scan.nextInt();
            scan.nextLine();

            soma += idade;
            i++;
        }
            double mediaIdades = (double) soma / i;
            System.out.println("A média das idades é: " + mediaIdades);
    }
    }

