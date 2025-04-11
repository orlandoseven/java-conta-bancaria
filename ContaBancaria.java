import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        String nome = "Orlando Seven";
        String tipoConta = "Corrente";
        double saldo = 2500.0;
        int teclado = 0;

        System.out.printf("""
                *****************************************
                Dados iniciais do cliente:
                
                Nome:               %s
                Tipo Conta:         %s
                Saldo Inicial:      R$ %.2f
                
                *******************************************
                %n""", nome, tipoConta, saldo);

        Scanner leitura = new Scanner(System.in);


        while (teclado != 4) {
            System.out.println("Operaçôes\n");
            System.out.println("1- Consultar Saldos");
            System.out.println("2- Depositar valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair");
            System.out.println("\nEscolha uma operação.");

            teclado = leitura.nextInt();

            if (teclado == 1) {
                System.out.println("Saldo R$: " + saldo +"\n");
            }

            if (teclado == 2) {
                System.out.println("Informe o valor do deposito R$: ");
                double depositar = leitura.nextDouble();
                saldo += depositar;
                System.out.println("Saldo atual R$: " + saldo +"\n");
            }

            if (teclado == 3) {
                System.out.println("Informe o valor da transferecia R$: ");
                double transferir = leitura.nextDouble();
                if (saldo >= transferir) {
                    saldo -= transferir;
                    System.out.println("Saldo atual R$: " + saldo +"\n");
                } else {
                    System.out.println("Saldo insuficiente.Consulte seu saldo.");
                }
            }

            if (teclado > 4 || teclado == 0) {
                System.out.println("Opção invalida\n");
            }

        }
    }
}
