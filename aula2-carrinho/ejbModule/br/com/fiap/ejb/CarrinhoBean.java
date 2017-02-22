package br.com.fiap.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class CarrinhoBean
 */
@Stateless
public class CarrinhoBean implements CarrinhoBeanRemote {

	private List<Item> itens = new ArrayList();

	protected CarrinhoBean() {
		super();
	}

	public void cadastrarItem(Item item) {
		itens.add(item);
		System.out.println("Item cadastrado com sucesso: " + item.getNome());
	}

	public List<Item> obterMedicamentos() {
		return this.itens;
	}

	public int obterQuantidadeItens() {
		return this.itens.size();
	}

	public void removerCadastro(int matricula) {
		// remover cadastro de recebimento de newsletter
	}

}
