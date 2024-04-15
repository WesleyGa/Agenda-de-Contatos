package com.agenda;

public class test {
	public static void main(String[] args) {

		AgendaContatos c1 = new AgendaContatos();
		c1.adicionarContato(new Contato("Wesley", 991029009));
		
		System.out.println(c1.getContatos());
	}

}
