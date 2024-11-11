package primeiraAulaBasico;
import  java.util.Scanner;

public class Atividade3Java {
    // Entrar com a tabuada de um numero qualquer e exibir

    public static void main(String[] args) {

        Scanner join = new Scanner(System.in);

        System.out.println("entre com um numero:");// exibindo

        int numero = join.nextInt(); // instancia da classe scanner na variavel // instancia = atribuição de valores

        int soma = 0;
        for (int i=0; i<10; i++){

            System.out.println(numero + "x" + (i+1) + '=' + numero*(i+1));
        }
    }
}
