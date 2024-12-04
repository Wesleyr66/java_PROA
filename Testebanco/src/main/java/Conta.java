import java.util.Random;
import java.util.Scanner;

public class Conta {

    Scanner entrada = new Scanner(System.in);

    int numero_conta;
    String titular_conta;
    double saldo;
    float emprestimo;
    float pagar_boleto;

    public Conta(String nome_titular, double saldo_inicial){
        this.titular_conta = nome_titular;
        this.saldo = saldo_inicial;

        Random gerador = new Random();

        numero_conta = gerador.nextInt(1000);
    }
    public void VarSaldo(){
        System.out.println("O numero da conta é " + numero_conta);
        System.out.println("O nome da conta é " + titular_conta);
        System.out.println("O saldo da conta é " + saldo);
    }

    public void Saque(double valor_saque){
        if (saldo >= valor_saque){
            this.saldo -= valor_saque;
            System.out.println("Seu saldo atual é de: "+saldo);
        }else {
            System.out.println("Saldo insufienciente, seu saldo é: "+saldo);
        }
    }

    public void Deposito(double valor_deposito){
        if (valor_deposito>=0){
            this.saldo += valor_deposito;
            System.out.println("Deposito realizado com sucesso, seu saldo é: "+saldo);
        } else {
            System.out.println("Saldo impossivel");
        }

    }

    public void Iniciar(){
        int opcao;

        do{
            Exibir_menu();
            opcao = entrada.nextInt();
            Escolher_funcao(opcao);
        }while (opcao!=6);
    }

    public void Exibir_menu(){
        System.out.println("Bem vindo ao banco X");
        System.out.println("Escolha sua opção");
        System.out.println("1 - Ver saldo");
        System.out.println("2 - Sacar");
        System.out.println("3 - Depositar");
        System.out.println("4 - Emprestimo");
        System.out.println("5 - Pagar boleto");
        System.out.println("6 - Finalizar");
    }

    public void Escolher_funcao(int opcao){
        double saque;
        double deposito;

        switch (opcao){
            case 1:
                VarSaldo();
                break;
            case 2:
                System.out.println("Digite o valor de saque: ");
                saque = entrada.nextDouble();
                Saque(saque);
                break;
            case 3:
                System.out.println("Digite o valor de deposito: ");
                deposito = entrada.nextDouble();
                Deposito(deposito);
                break;
            case 4:
                System.out.println("Qual valor de emprestimo");
                emprestimo = entrada.nextFloat();
                Emprestimo(emprestimo);
                break;
            case 5:
                System.out.println("Qual valor do boleto");
                pagar_boleto = entrada.nextFloat();
                Boleto(pagar_boleto);
                break;
            case 6:
                System.out.println("Operação finalizada!");
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }
    }

    public void Emprestimo(float emprestimo){
        if (emprestimo<=saldo){
            this.saldo += emprestimo;
            System.out.println("Seu saldo agora é: "+saldo);
        }else {
            System.out.println("Emprestimo não autorizado");
        }
    }

    public void Boleto(float pagar_boleto){
        if (pagar_boleto>saldo){
            System.out.println("Saldo insuficiente");
        }else if (pagar_boleto<0){
            System.out.println("Boleto invalido");
        }else {
            this.saldo -= pagar_boleto;
            System.out.println("boleto pago, seu saldo é: "+saldo);
        }
    }
}
