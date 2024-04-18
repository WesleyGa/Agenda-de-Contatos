package com.agenda;

public class test {
	public static void main(String[] args) {

		AgendaContatos contatos = new AgendaContatos();
		contatos.adicionarContato("Wesley", 234095743);
		contatos.adicionarContato("Jose", 403093244);
		contatos.adicionarContato("Eduardo", 962938432);
		contatos.adicionarContato("Matheus", 23049383);
		contatos.adicionarContato("Izac", 932045729);
		contatos.adicionarContato("Izac", 233249932);

		contatos.alterarContato(2, "Elias", 23123123);

		contatos.visualizarContatos();

		contatos.removerContato(2);

		contatos.visualizarContatos();
		contatos.buscarContato("IZAC  ");
	}

}
