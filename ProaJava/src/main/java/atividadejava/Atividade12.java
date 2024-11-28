package atividadejava;

import java.util.Scanner;

public class Atividade12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a sua altura:");
        float altura = scan.nextFloat();

        System.out.println("Digite o seu peso");
        float peso = scan.nextFloat();

        System.out.println("O seu IMC É:" + peso/(altura*altura)) ;
    }


}
