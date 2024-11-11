package comandoscondicionais;
import java.util.Scanner;
public class Eleicao {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int idade;

        System.out.println("Qual sua idade");
        idade = scan.nextInt();

        if (idade<16){
            System.out.println("Não vota");
        } else if (idade >= 16 && idade < 18) {
            System.out.println("Voto não obrigatorio");
        } else if (idade >=18 && idade < 70) {
            System.out.println("Voto Obrigatorio");
        } else {
            System.out.println("Voto não obrigatorio");
        }

    }

}
