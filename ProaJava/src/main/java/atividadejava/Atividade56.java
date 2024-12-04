package atividadejava;

import java.util.Scanner;

public class Atividade56 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("numero:");
        int num = scan.nextInt();
        int cont = 1;
        do{
            if (num%cont==0){
                System.out.println(cont);
            }
            cont++;
        }while(cont<num);
    }
}
