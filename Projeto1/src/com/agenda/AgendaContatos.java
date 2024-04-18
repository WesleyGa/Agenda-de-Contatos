package com.agenda;

import java.util.ArrayList;

import java.util.List;

public class AgendaContatos {

	private List<Contato> contatos;
	private int n1;

	public AgendaContatos() {
		contatos = new ArrayList<>();
		n1 = 1;
	}

	private void adicionarContato(Contato contato) {
		contato.setNumero(n1);
		this.contatos.add(contato);
		n1++;
	}

	/*
	 * Em vez de ter que criar manualmente um novo objeto Contato toda vez que você
	 * deseja adicionar um contato, você pode chamar esse método adicionarContato
	 */
	public void adicionarContato(String nome, int telefone) {

		this.adicionarContato(new Contato(nome, telefone));
	}

	public void visualizarContatos() {
		if (contatos.isEmpty()) {
			System.out.println("Nenhum contato.");
		} else {

			for (Contato con : contatos) {
				System.out.println(con.getNumero() + "º contato:");
				System.out.println("Nome: " + con.getNome());
				System.out.println("Telefone: " + con.getTelefone());
				System.out.println("------------------------------");
			}

		}

	}

	public void alterarContato(int numero, String novoNome, int novoNumero) {
		boolean encontrado = false;
		for (int i = 0; i < contatos.size(); i++) {

			// Esta linha está obtendo o contato na posição i da lista de contatos
			// (contatos) e armazenando na variável con.
			Contato con = contatos.get(i);
			if (con.getNumero() == numero) {
				con.setNome(novoNome);
				con.setTelefone(novoNumero);
				encontrado = true;
				System.out.println("Contato alterado!!");

				break;
			}
		}

		if (!encontrado) {
			System.out.println("Contato não encontrado");
		}
	}

	public void removerContato(int numeroContato) {
		boolean removido = false;
		for (int i = 0; i < contatos.size(); i++) {
			Contato con = contatos.get(i);
			if (con.getNumero() == numeroContato) {
				contatos.remove(i);
				removido = true;
				System.out.println("Contato removido com sucesso.");

				break; // Sai do loop após remover o contato
			}

		}
		if (!removido) {
			System.out.println("Contato não encontrado.");
		}
	}

	public void buscarContato(String nome) {
		boolean encontrado = false;
		for (int i = 0; i < contatos.size(); i++) {
			Contato con = contatos.get(i);
			String nomes = nome.trim();
			if (con.getNome().equalsIgnoreCase(nomes)) {
				System.out.println(con);
				encontrado = true;

			}
		}
		if (!encontrado) {
			System.out.println("Não existe nenhum contato com esse nome.");
		}
	}

	public List<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}

}
