package atividadejava;

import java.util.Scanner;

public class Atividade02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double raio,perimetro,area;

        System.out.println("Entre com o raio do círculo:");
        raio = scan.nextDouble();

        perimetro = 3.14 * 2 * raio;
        area = 3.14 * (raio*raio);

        System.out.println(" O raio é: "+raio + " O perimetro é: "+perimetro +" A area é: "+area);
    }
}
