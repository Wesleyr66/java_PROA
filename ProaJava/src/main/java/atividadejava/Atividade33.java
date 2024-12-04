package atividadejava;

import java.util.Scanner;

public class Atividade33 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual seu turno: M/V");
        String turno = scan.next();

        switch (turno){
            case "M":
                System.out.println("Bom dia");
                break;
            case "V":
                System.out.println("Boa tarde");
                break;
        }
    }
}
