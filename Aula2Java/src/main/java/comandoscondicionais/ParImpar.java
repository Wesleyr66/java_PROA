package comandoscondicionais;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float num;

        System.out.println("Digite o numero: ");
        num = scan.nextFloat();

        if (num%2 == 0){
            System.out.println("numero é PAR");
        }else {
            System.out.println("numero é IMPAR");
        }
    }
}
