package com.agenda;

public class test {
	public static void main(String[] args) {

		AgendaContatos contatos = new AgendaContatos();
		contatos.adicionarContato("Wesley", 991029009);
		contatos.adicionarContato("Eliel", 123131232);

		contatos.alterarContato(2, "Jose", 23123123);

		contatos.visualizarContatos();

		contatos.removerContato(1);
		
		contatos.visualizarContatos();
	}

}
