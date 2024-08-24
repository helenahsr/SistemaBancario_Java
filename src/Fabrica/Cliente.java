package Fabrica;

public class Cliente {
	
	private String cpf;
	private String nome;
	private String rg;
	
	//Gets e Sets
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	//Construtor sem parametros
	
	public Cliente() {
		
	}
	
	//Construtor com nome da classe
	
	public Cliente(String cpf, String nome, String rg) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.rg = rg;
	}
}
