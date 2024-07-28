import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner tc = new Scanner(System.in);
        double saldo = 25;
        double valor_solicitado = 18;

        System.out.println("Entre com o valor q deseja retirar:");
        valor_solicitado = tc.nextDouble();

        if(saldo > valor_solicitado){
            saldo -= valor_solicitado;
        }
        else{
            System.out.println("Saldo insuficiente: ");
            System.out.println(saldo);
        }

    }
}
