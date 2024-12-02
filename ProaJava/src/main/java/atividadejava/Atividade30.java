package atividadejava;

import java.util.Scanner;

public class Atividade30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("quantidade de maças:");
        float maca = scan.nextFloat();

        if (maca<12){
            maca *= 0.50;
        }else {
            maca *= 0.40;
        }
        System.out.println("valor total das maças: "+maca);
    }
}
