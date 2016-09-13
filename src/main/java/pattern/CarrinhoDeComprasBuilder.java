package pattern;

import entity.CarrinhoDeCompras;
import entity.Item;

public class CarrinhoDeComprasBuilder {
	public CarrinhoDeCompras carrinho;

	public CarrinhoDeComprasBuilder(CarrinhoDeCompras carrinho) {
		this.carrinho = carrinho;
	}

	public CarrinhoDeComprasBuilder comItens(double... valores) {
		for (double valor : valores) {
			carrinho.adiciona(new Item("item", 1, valor));
		}
		return this;
	}

	public CarrinhoDeCompras cria() {
		return carrinho;
	}
}
