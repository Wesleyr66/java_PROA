package comandoscondicionais;

import java.util.Scanner;

public class Switch4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o numero do cargo:");
        int numero = scan.nextInt();

        String cargo;
        double salario = 0;

        switch (numero){
            case 1:
                cargo = "Programador estagiário";
                salario = 1400*1.10;
                break;
            case 2:
                cargo = "Programador junior";
                salario = 3000*1.12;
                break;
            case 3:
                cargo = "Programador pleno";
                salario = 5500*1.13;
                break;
            case 4:
                cargo = "Programador senior";
                salario = 8000*1.15;
                break;
            case 5:
                cargo = "Programador master";
                salario = 12000*1.18;
                break;
            default:
                cargo = "Cargo invalido";
        }
        System.out.println(cargo + " - salario: " + String.format("%.2f", salario));
    }
}
