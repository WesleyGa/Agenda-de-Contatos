package com.agenda;

public class Contato {

	private String nome;
	private int telefone;
	private int numero; // Adicionando o número de identificação único para o contato

	public Contato(String nome, int telefone) {
		this.nome = nome;
		this.telefone = telefone;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	

	@Override
	public String toString() {
		return "Nome: " + nome + ", Telefone: " + telefone;
	}

}
