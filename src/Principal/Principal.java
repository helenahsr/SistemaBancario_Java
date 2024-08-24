package Principal;
import java.util.Scanner;
import Fabrica.Banco;
import Fabrica.Cliente;
import Fabrica.Conta;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o código, nome e site do banco:");
		int codigoBanco = sc.nextInt();
		String nomeBanco = sc.next();
		String siteBanco = sc.next();
		Banco banco = new Banco(codigoBanco, nomeBanco, siteBanco);

		System.out.println("Digite o CPF, nome e RG do cliente A:");
		String cpfA = sc.next();
		String nomeA = sc.next();
		String rgA = sc.next();
		Cliente clienteA = new Cliente(cpfA, nomeA, rgA);
		
		System.out.println("Digite o CPF, nome e RG do cliente B:");
		String cpfB = sc.next();
		String nomeB = sc.next();
		String rgB = sc.next();
		Cliente clienteB = new Cliente(cpfB, nomeB, rgB);

		System.out.println("Digite a agência e número da conta A:");
		int agenciaA = sc.nextInt();
		int numeroContaA = sc.nextInt();
		Conta contaA = new Conta();
		contaA.setCliente(clienteA);
		contaA.setBanco(banco);
		contaA.setAgencia(agenciaA);
		contaA.setConta(numeroContaA);
		contaA.setSaldo(0);
		
		System.out.println("Digite a agência e número da conta B:");
		int agenciaB = sc.nextInt();
		int numeroContaB = sc.nextInt();
		Conta contaB = new Conta();
		contaB.setCliente(clienteB);
		contaB.setBanco(banco);
		contaB.setAgencia(agenciaB);
		contaB.setConta(numeroContaB);
		contaB.setSaldo(0);
 
        //Imprima as duas contas utilizando o método toString
        System.out.println(contaA.toString());
        System.out.println(contaB.toString());
        
        // Realize o processo de deposito de R$ 1500 para cada conta;
        
        contaA.Depositar(1500);
        contaB.Depositar(1500);
        
        // Realize um saque de R$ 500 nas duas contas
        
        contaA.Sacar(500);
        contaB.Sacar(500);
        
        // Transfira R$ 500 da contaA para contaB
       
        contaA.Transferir(500, contaB);
        
        // Imprima as duas contas novamente utilizando o método toString
        
        System.out.println(contaA.toString());
        System.out.println(contaB.toString());
        
        // Tente realizar uma transferência acima do valor do saldo.
        	// Emita uma mensagem falando Saldo insuficiente
        
        contaA.Transferir(1000, contaB);
        
        // Tente realizar um deposito de um valor negativo ou 0.
        	// Emita uma mensagem falando valor inválido.
        
        contaA.Depositar(-100);

	}

}
