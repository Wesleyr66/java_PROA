package comandoscondicionais;

import java.util.Scanner;

public class Switch3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o numero do combo:");
        int numero = scan.nextInt();
        String combo;

        switch (numero){
            case 1:
                combo = "Big Mac, Batata Frita Média, Refrigerante Médio";
                break;
            case 2:
                combo = "McChicken, Batata Frita Média, Refrigerante Médio";
                break;
            case 3:
                combo = "Whopper, Batata Frita Média, Refrigerante Médio";
                break;
            case 4:
                combo = "Cheddar Duplo, Onion Rings, Refrigerante Médio";
                break;
            case 5:
                combo = "Quarterão com Queijo, Batata Frita Grande, Refrigerante Grande";
                break;
            default:
                combo = "Número inválido. Tente novamente.";
        }
        System.out.println(combo);
    }
}
