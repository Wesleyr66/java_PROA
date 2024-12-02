package atividadejava;

import java.util.Scanner;

public class Atividade28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("qual seu peso");
        float peso = scan.nextFloat();

        System.out.println("Qual sua altura");
        float altura = scan.nextFloat();

        float imc = peso /(altura*altura);

        String classificacao;
        if (imc < 18.5) {
            classificacao = "Abaixo do peso";
        } else if (imc >= 18.5 && imc < 24.9) {
            classificacao = "Peso normal";
        } else if (imc >= 25.0 && imc < 29.9) {
            classificacao = "Sobrepeso";
        } else if (imc >= 30.0 && imc < 34.9) {
            classificacao = "Obesidade grau 1";
        } else if (imc >= 35.0 && imc < 39.9) {
            classificacao = "Obesidade grau 2";
        } else {
            classificacao = "Obesidade grau 3 (mórbida)";
        }

        System.out.println(imc + classificacao);
    }
}
