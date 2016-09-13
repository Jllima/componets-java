package entity;

import junit.framework.Assert;

import org.junit.Test;

import enums.Cargo;

public class CalculadoraDeSalariosTest {

	@Test
	public void deveCalcularSalarioParaDesenvolvedoresComSalarioAbaixoDoLimite() {

		CalculadoraDeSalarios calc = new CalculadoraDeSalarios();

		Funcionario desenvolvedor = new Funcionario("Mauricio", 1500, Cargo.DESENVOLVEDOR);

		double salario = calc.calculaSalario(desenvolvedor);

		Assert.assertEquals(1500 * 0.9, salario, 0.00001);

	}

	@Test
	public void deveCalcularSalarioParaDesenvolvedoresComSalarioAcimaDoLimite() {
		CalculadoraDeSalarios calc = new CalculadoraDeSalarios();

		Funcionario desenvolvedor = new Funcionario("Mauricio", 4000, Cargo.DESENVOLVEDOR);
		
		double salario = calc.calculaSalario(desenvolvedor);

		Assert.assertEquals(4000 * 0.8, salario, 0.00001);
	}

	@Test
	public void deveCalcularSalarioParaDBAsComSalarioAbaixoDoLimite() {
		CalculadoraDeSalarios calc = new CalculadoraDeSalarios();

		Funcionario dba = new Funcionario("Goku", 500.0, Cargo.DBA);

		double salario = calc.calculaSalario(dba);

		Assert.assertEquals(500.0 * 0.85, salario, 0.00001);
	}

}
