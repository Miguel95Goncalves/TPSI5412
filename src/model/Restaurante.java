package model;

public class Restaurante {
	private int id;
	private String nome,morada,telefone,especialidade;
	
	public Restaurante(int id, String nome, String morada, String telefone, String especialidade) {
		super();
		this.id = id;
		this.nome = nome;
		this.morada = morada;
		this.telefone = telefone;
		this.especialidade = especialidade;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMorada() {
		return morada;
	}
	public void setMorada(String morada) {
		this.morada = morada;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
}
