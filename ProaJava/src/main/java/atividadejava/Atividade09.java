package atividadejava;

import java.util.Scanner;

public class Atividade09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float num,juros,res = 0;

        System.out.println("Qual o valor de deposito: ");
        num = scan.nextFloat();
        System.out.println("Qual a taxa de juros mensal: ");
        juros = scan.nextFloat();

        for (int i=0;i<12;i++){
            res += num+((res*juros)/100);
            System.out.println(res);
        }
    }
}
