package atividadejava;

import java.util.Scanner;

public class Atividade27 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("M ou F");
        String genero = scan.next();

        System.out.println("Idade");
        int idade = scan.nextInt();

        switch (genero){
            case "M": if (idade>=65){
                System.out.println("Pode se aposentar "+idade);
            }else{
                System.out.println("nao pode");
            } break;
            case "F": if (idade>60){
                System.out.println("Pode se aposentar "+idade);
            }else{
                System.out.println("nao pode");
            } break;
        }
    }
}
