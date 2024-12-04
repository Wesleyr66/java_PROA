package atividadejava;

import java.util.Scanner;

public class Atividade71 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("numero:");
        int num = scan.nextInt();
        for(int cont = 1;cont<num;cont++){
            if (num%cont==0){
                System.out.println(cont);
            }
        }
    }
}
