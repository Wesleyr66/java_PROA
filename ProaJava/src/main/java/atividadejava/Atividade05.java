package atividadejava;

import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float preco,quant;
        double res = 0;

        System.out.println("Preço do produto");
        preco = scan.nextFloat();
        System.out.println("Quantidade comprada");
        quant = scan.nextFloat();

        if (quant>10){
            res = (preco*quant)*0.9;
        }else {
            res = preco*quant;
        }
        System.out.println("O valor total é: " + res);
    }
}
