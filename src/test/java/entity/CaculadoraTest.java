package entity;

import org.junit.Test;

import junit.framework.Assert;

public class CaculadoraTest {
	
	@Test
	public void somaTest(){
		Calculadora calc = new Calculadora(1, 2);
		
		int result = calc.soma();
		
		Assert.assertEquals(3, result);
	}
	
	@Test
	public void resto_test(){
		Calculadora calc = new Calculadora();
		
		Assert.assertEquals(0, calc.resto());
	}
	
	@Test
	public void calc_valor_x(){
		Calculadora calc = new Calculadora();
		
		Assert.assertEquals(3, calc.calValorX());
	}
	
}
