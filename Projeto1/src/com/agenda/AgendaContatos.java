package com.agenda;

import java.util.ArrayList;
import java.util.List;

public class AgendaContatos {

	private List<Contato> contatos;

	public AgendaContatos() {
		contatos = new ArrayList<>();
	}

	public void adicionarContato(Contato contato) {
		this.contatos.add(contato);
	}

	public List<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}
	
	 
	

}
