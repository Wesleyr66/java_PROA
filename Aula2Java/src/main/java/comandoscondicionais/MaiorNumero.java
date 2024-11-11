package comandoscondicionais;

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float num,num2;

        System.out.println("Digite um numero:");
        num = scan.nextFloat();

        System.out.println("Digite um numero:");
        num2 = scan.nextFloat();

        if (num > num2){
            System.out.printf("O maior numero é: %.02f",num);
        } else {
            System.out.printf("O maior numero é: %.02f",num2);
        }

    }
}
