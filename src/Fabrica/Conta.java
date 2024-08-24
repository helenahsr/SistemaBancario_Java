package Fabrica;

public class Conta {
	
	private Cliente cliente;
	private Banco banco;
	private int agencia;
	private int conta;
	private double saldo;
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Banco getBanco() {
		return banco;
	}
	public void setBanco(Banco banco) {
		this.banco = banco;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public Conta() {
		
	}
	
	public Conta(Cliente cliente, Banco banco, int agencia, int conta, double saldo) {
		this.cliente = cliente;
		this.banco = banco;
		this.agencia = agencia;
		this.conta = conta;
		this.saldo = saldo;
	}
	
	public void Depositar(double valor) {
		if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito. O valor deve ser positivo.");
        }
	}
	
	public void Sacar(double valor) {
		if (valor <= 0) {
			System.out.println("Valor inválido para saque. O valor deve ser positivo.");
        }

        if (valor > saldo) {
        	System.out.println("Saldo insuficiente.");
        }

        saldo -= valor;
        System.out.println("Saque realizado com sucesso.");
	}
	
	public void Transferir(double valor, Conta destino) {
		if (valor <= 0) {
			System.out.println("Valor inválido para transferência. O valor deve ser positivo.");
        }

        if (valor > saldo) {
            System.out.println("\nSaldo insuficiente para realizar a transferência.");
        }
        else {
        	saldo -= valor;
            destino.Depositar(valor);
            System.out.println("Transferência realizada com sucesso.");
        }

        
	}
}
