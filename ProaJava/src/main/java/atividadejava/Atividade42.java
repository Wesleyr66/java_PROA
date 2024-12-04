package atividadejava;

import java.util.Scanner;

public class Atividade42 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("numero:");
        int num = scan.nextInt();
        int cont = 2;

        while (cont<num){
            if (num%cont==0){
                System.out.println("não é primo");
                break;
            }else if (cont==num-1){
                if (num%cont!=0){
                    System.out.println("numero é primo");
                    break;
                }
            }
            cont++;
        }
    }
}
