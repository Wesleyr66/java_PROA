package atividadejava;

public class Atividade75 {
    public static void main(String[] args) {

        int fibo1 = 0,fibo2 = 1;

        for (int i = 0;i<10;i++){
            System.out.println(fibo1);
            fibo1+=fibo2;
            System.out.println(fibo2);
            fibo2+=fibo1;

        }
    }
}
