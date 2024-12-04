package atividadejava;

public class Atividade60 {
    public static void main(String[] args) {
        int i = 0;

        int fibo1 = 0,fibo2 = 1;

        do{
            System.out.println(fibo1);
            fibo1+=fibo2;
            System.out.println(fibo2);
            fibo2+=fibo1;

            i++;
        }while (i<10);
    }
}
