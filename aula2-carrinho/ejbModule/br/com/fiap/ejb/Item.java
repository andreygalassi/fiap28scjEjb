package br.com.fiap.ejb;

import java.io.Serializable;

public class Item implements Serializable {
//	private static final long serialVersionUID = 8034259959961746151L;
	private static final long serialVersionUID = 12311L;
	private String nome;
	private double preco;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome= nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco= preco;
	}
}

