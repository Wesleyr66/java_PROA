package primeiraAulaBasico;
import  java.util.Scanner;

public class Atividade2Java {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int soma = 0;
        for (int i=0; i<4; i++){

            System.out.println("numero" +(i+1));// exibindo
            int numero = entrada.nextInt(); // instancia da classe scanner na variavel // instancia = atribuição de valores

            soma += numero;

        }

        System.out.println("a media dos numeros é: " + soma/4 );
    }
}
