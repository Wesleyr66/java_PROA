package comandoscondicionais;

import java.util.Scanner;

public class Switch1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o estado do farol:");
        int farol = scan.nextInt();
        String mensagem;

        switch (farol){
            case 1: mensagem="Farol verde!";
                break;
            case 2: mensagem="Farol amarelo!";
                break;
            case 3: mensagem="Farol vermelho!";
                break;
            default: mensagem="farol invalido";
            break;
        }

        System.out.println(mensagem);
    }
}
