package atividadejava;

import java.util.Scanner;

public class Atividade32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a nota do aluno (0 a 10): ");
        float nota = scan.nextFloat();

        String conceito;
        if (nota >= 9.0 && nota <= 10.0) {
            conceito = "A";
        } else if (nota >= 7.0 && nota < 9.0) {
            conceito = "B";
        } else if (nota >= 5.0 && nota < 7.0) {
            conceito = "C";
        } else if (nota >= 3.0 && nota < 5.0) {
            conceito = "D";
        } else if (nota >= 0.0 && nota < 3.0) {
            conceito = "E";
        } else {
            conceito = "Nota inválida!";
        }

        System.out.println("Conceito: " + conceito);

    }
}
