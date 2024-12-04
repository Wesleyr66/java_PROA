package atividadejava;

import java.util.Scanner;

public class Atividade72 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("numero:");
        int num = scan.nextInt();

        for (int cont = 2;cont<num;cont++){
            if (num%cont==0){
                System.out.println("não é primo");
                break;
            }else if (cont==num-1){
                if (num%cont!=0){
                    System.out.println("numero é primo");
                    break;
                }
            }
        }
    }
}
