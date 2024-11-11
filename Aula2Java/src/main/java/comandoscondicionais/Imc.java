package comandoscondicionais;
import java.util.Scanner;

public class Imc {

    public static void main(String[] args) {

        float peso,altura,imc;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu peso:");
        peso = scan.nextFloat();

        System.out.println("Digite sua altura:");
        altura = scan.nextFloat();

        imc = peso/(altura*altura);

        System.out.printf("Imc = %.2f", imc);

        if (imc<18.5){
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Peso ideal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Levemente acima do peso");
        } else if (imc > 30 && imc < 35) {
            System.out.println("Obesidade grau I");
        }else if (imc >= 35 && imc < 40) {
            System.out.println("Obesidade grau II");
        }else {
            System.out.println("Obesidade grau III");
        }


    }

}
