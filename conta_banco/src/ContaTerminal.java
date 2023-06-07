import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo = 237.48;

        Scanner teclado = new Scanner(System.in);

        System.out.println("                Sistema Bancário");
        System.out.println("                -*-*-*-*-*-*-*-*-");

        System.out.println("Digite o seu nome completo! ");
        nomeCliente = teclado.nextLine();

        System.out.println("Por favor, digite o número da agencia! ");
        agencia = teclado.nextLine();
        
        System.out.println("Por favor, digite o número da conta! ");
        numeroConta = teclado.nextInt();

        
        System.out.println("Olá "+ nomeCliente + ", obrigada por criar uma conta em nosso banco, sua agência é "
                            +agencia+ " conta " + numeroConta + " e seu saldo " + saldo + " já está disponivel para saque." );

        teclado.close();
    }

   
}

