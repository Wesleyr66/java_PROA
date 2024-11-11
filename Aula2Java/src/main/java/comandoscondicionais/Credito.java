package comandoscondicionais;
import java.util.Scanner;

public class Credito {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double credito;
        float salario,soma = 0;

        System.out.println("Qual seu salario");
        salario = scan.nextFloat();
        soma += salario;

        System.out.println("Qual seu salario");
        salario = scan.nextFloat();
        soma += salario;

        System.out.println("Qual seu salario");
        salario = scan.nextFloat();
        soma += salario;

        System.out.println("Qual seu salario");
        salario = scan.nextFloat();
        soma += salario;

        System.out.println("Qual seu salario");
        salario = scan.nextFloat();
        soma += salario;

        System.out.println("Qual seu salario");
        salario = scan.nextFloat();
        soma += salario;

        salario = soma/6;

        // sem usar FOR, WHILE, DO WHILE;

        if (salario <= 500){
            credito = 0;
        } else if (salario > 500 && salario <= 1000) {
            credito = (salario * 0.3);
        } else if (salario > 1000 && salario <= 3000) {
            credito = (salario * 0.4);
        } else {
            credito = (salario * 0.5);
        }

        System.out.printf("O Crédito disponivel é: %.02f", credito);
    }
}