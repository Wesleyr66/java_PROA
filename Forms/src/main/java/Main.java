import java.time.LocalDate;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        Celular celular1 = new Celular();

        celular1.cor = "Amarelo";
        celular1.cameraFrontal = true;
        celular1.gorillaGlass = true;
        celular1.modelo = "Nokia";
        celular1.preco = 1999.99;

        celular1.ligar();
        celular1.atender();

        System.out.println("Modelo: " + celular1.modelo);
        System.out.println("Cor: " + celular1.cor);
        System.out.println("Gorilla Glass:" + celular1.gorillaGlass);
        System.out.println("Preço: " + celular1.preco);
        System.out.println("Camera:" + celular1.cameraFrontal);


        Festa festa1 = new Festa();

        festa1.valor = 150;
        festa1.enfeites = true;
        festa1.data = LocalDate.of(2999, 3, 19);
        festa1.capacidade = 1500 ;
        festa1.horario = LocalTime.of(14, 30, 45);

        festa1.estado();
    }
}
