package model;

import entity.CarrinhoDeCompras;
import entity.Item;

public class MaioPreco {

	public double encontar(CarrinhoDeCompras carrinhoDeCompras) {
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
