package br.com.fiap.cliente;

import java.rmi.Naming;

import br.com.fiap.rmi.Carrinho;
import br.com.fiap.rmi.Item;

public class ClienteCarrinho {
	public static void main(String[] args) throws Exception {
		Carrinho carrinho = (Carrinho) Naming.lookup("rmi://10.20.74.41:1099/farmacia/carrinho");
		Item item1 = new Item();
		item1.setNome("remedio 3"); //digite o nome de um item qualquer aqui
		item1.setPreco(3.0);
		Item item2 = new Item();
		item2.setNome("remedio 4"); //digite o nome de um item qualquer aqui
		item2.setPreco(5.0);
		carrinho.cadastrarItem(item1);
		carrinho.cadastrarItem(item2);
		System.out.println(carrinho.obterQuantidadeItens());
	}
}
