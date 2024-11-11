package comandoscondicionais;

import java.util.Scanner;

public class MenorNumero {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float num1,num2,num3;

        System.out.println("Digite o numero: ");
        num1 = scan.nextFloat();

        System.out.println("Digite o numero: ");
        num2 = scan.nextFloat();

        System.out.println("Digite o numero: ");
        num3 = scan.nextFloat();

        if (num1<num2 && num1<num3){
            System.out.println(num1 + " É o menor numero");
        } else if (num2<num1 && num2<num3) {
            System.out.println(num2 + " É o menor numero");
        } else {
            System.out.println(num3 + " É o menor numero");
        }

    }
}
