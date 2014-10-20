package br.com.entidade;


public class Pessoa {

	private int codigo;
	private String nome;
	private String informaçãoAvulsa;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getInformaçãoAvulsa() {
		return informaçãoAvulsa;
	}

	public void setInformaçãoAvulsa(String informaçãoAvulsa) {
		this.informaçãoAvulsa = informaçãoAvulsa;
	}

	public Pessoa(int codigo, String nome, String informaçãoAvulsa) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.informaçãoAvulsa = informaçãoAvulsa;
	}

	@Override
	public String toString() {
		return "Pessoa [codigo=" + codigo + ", nome=" + nome
				+ ", informaçãoAvulsa=" + informaçãoAvulsa + "]";
	}

}
