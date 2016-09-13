package entity;

import org.junit.Test;

import entity.Funcionario;
import enums.Cargo;
import junit.framework.Assert;

public class CalculadoraDeSalariosTest {

	@Test
	public void deveCalcularSalarioParaDesenvolvedoresComSalarioAbaixoDoLimite() {

		CalculadoraDeSalarios calc = new CalculadoraDeSalarios();

		Funcionario desenvolvedor = new Funcionario("Mauricio", 1500, Cargo.DESENVOLVEDOR);

		double salario = calc.calculaSalario(desenvolvedor);

		Assert.assertEquals(1500 * 0.9, salario, 0.00001);

	}

	public void deveCalcularSalarioParaDesenvolvedoresComSalarioAcimaDoLimite() {
		CalculadoraDeSalarios calc = new CalculadoraDeSalarios();

		Funcionario desenvolvedor = new Funcionario("Mauricio", 4000, Cargo.DESENVOLVEDOR);
		
		double salario = calc.calculaSalario(desenvolvedor);

		Assert.assertEquals(1500 * 0.8, salario, 0.00001);
	}

}
