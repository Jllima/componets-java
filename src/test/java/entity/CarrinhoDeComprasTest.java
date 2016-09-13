package entity;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import pattern.CarrinhoDeComprasBuilder;

public class CarrinhoDeComprasTest {

	private CarrinhoDeCompras carrinho;

	private CarrinhoDeComprasBuilder buider;

	@Before
	public void inicializa() {
		carrinho = new CarrinhoDeCompras();
	}

	@Test
	public void deveRetornarZeroSeCarrinhoVazio() {

		Assert.assertEquals(0.0, carrinho.maiorValor(carrinho), 0.0001);
	}

	@Test
	public void deveRetornarValorDoItemSeCarrinhoCom1Elemento() {
		carrinho.adiciona(new Item("Geladeira", 1, 900.0));

		Assert.assertEquals(900.0, carrinho.maiorValor(carrinho), 0.0001);
	}

	@Test
	public void deveRetornarMaiorValorSeCarrinhoContemMuitosElementos() {
		carrinho.adiciona(new Item("Geladeira", 1, 900.0));
		carrinho.adiciona(new Item("Fogão", 1, 1500.0));
		carrinho.adiciona(new Item("Máquina de Lavar", 1, 750.0));

		double valor = carrinho.maiorValor(carrinho);

		Assert.assertEquals(1500.0, valor, 0.0001);

	}


}
