package primeiraAulaBasico; //pacote (pasta)
import java.util.Scanner; // libs

public class PrimeiraAula {

    public static void main(String[] args) {  // classe principal

        Scanner entrada = new Scanner(System.in); // entra de dados pelo teclado

        System.out.println("Entre com o primeiro numero: "); // exibindo
        int numero = entrada.nextInt(); // instancia da classe scanner na variavel // instancia = atribuição de valores

        System.out.println("Entre com o segundo numero: ");
        int numero2 = entrada.nextInt();

        System.out.println("O valor do numero é: " + numero);
        System.out.println("O valor do numero2 é: " + numero2);
        System.out.println("O valor da soma é: " + (numero+numero2));
    }
}
