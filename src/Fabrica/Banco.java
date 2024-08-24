package Fabrica;

public class Banco {
	private int numero;
	private String nome;
	private String site;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	
	public Banco() {
		
	}
	
	public Banco(int numero, String nome, String site) {
		super();
		this.numero = numero;
		this.nome = nome;
		this.site = site;
	}
}
