package entity;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	private List<Item> itens;

	public CarrinhoDeCompras() {
		this.itens = new ArrayList<Item>();
	}

	public void adiciona(Item item) {
		this.itens.add(item);
	}

	public List<Item> getItens() {
		return itens;
	}

	public double maiorValor(CarrinhoDeCompras carrinhoDeCompras) {
		if (carrinhoDeCompras.getItens().size() == 0)
			return 0;

		double maior = carrinhoDeCompras.getItens().get(0).getValorTotal();

		for (Item item : carrinhoDeCompras.getItens()) {
			if (maior < item.getValorTotal()) {
				maior = item.getValorTotal();
			}
		}
		return maior;
	}

}
