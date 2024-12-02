package atividadejava;

import java.util.Scanner;

public class Atividade21 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int menor=0,maior=0;

        for (int i=0;i<5;i++){
            System.out.println("Idade");
            int idade = scan.nextInt();

            if (idade>18){
                maior++;
            }else {
                menor++;
            }
        }

        System.out.println("maiores "+maior +" menores "+menor);
    }
}
