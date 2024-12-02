package atividadejava;

import java.util.Arrays;
import java.util.Scanner;

public class Atividade24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] num = new int[3];
        for (int i=0;i<3;i++){
            System.out.println("numero");
            num[i] = scan.nextInt();
        }
        Arrays.sort(num);

        System.out.println(Arrays.toString(num));
    }
}
