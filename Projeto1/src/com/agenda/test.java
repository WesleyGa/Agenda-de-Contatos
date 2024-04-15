package com.agenda;

public class test {
	public static void main(String[] args) {

		AgendaContatos contatos = new AgendaContatos();
		contatos.adicionarContato("Wesley", 991029009);
		contatos.adicionarContato("Eliel", 1123131232);

		contatos.removerContato(1);
		contatos.visualizarContatos();
	}

}
