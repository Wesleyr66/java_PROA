package atividadejava;

import java.util.Scanner;

public class Atividade26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Codigo do produto: 1-4");
        int produto = scan.nextInt();

        System.out.println("Quantidade");
        int quantidade = scan.nextInt();

        int total =0;
        switch (produto){
            case 1:
                total = 50 * quantidade;
                break;
            case 2:
                total = 20 * quantidade;
                break;
            case 3:
                total = 30 * quantidade;
                break;
            case 4:
                total = 80 * quantidade;
                break;
            default: break;
        }

        System.out.println(total);
    }
}
