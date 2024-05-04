import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       
        Scanner scan =  new Scanner(System.in);
        
        
        
        
        System.out.println(" ---- Conta Bancária ---- ");
        System.out.println("  ");
        
        System.out.println("Por favor, digite Nome do Cliente : ");
        String nomeCliente = scan.nextLine();
        
        System.out.println("Digite o número da Agência : '067-8' ");
        String agencia = scan.nextLine();
        
        System.out.println("Digite o número da Conta : '1021'");
        int numero = scan.nextInt();
        
        System.out.println("Por favor digite o Saldo :");
        double saldo = scan.nextDouble(); 
        
        
        System.out.println();
        System.out.println("Olá ".concat(nomeCliente) 
        + ", obrigado por criar uma conta em nosso banco, sua agência é ".concat(agencia) +
         ", conta numero e seu saldo R$" + saldo + " já está disponível para saque.");

        scan.close();

    }


}
