package entity;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import enums.Cargo;

public class CalculadoraDeSalariosTest {

	private CalculadoraDeSalarios calc;

	@Before
	public void inicializa() {
		this.calc = new CalculadoraDeSalarios();
	}

	@Test
	public void deveCalcularSalarioParaDesenvolvedoresComSalarioAbaixoDoLimite() {


		Funcionario desenvolvedor = new Funcionario("Mauricio", 1500, Cargo.DESENVOLVEDOR);

		double salario = calc.calculaSalario(desenvolvedor);

		Assert.assertEquals(1500 * 0.9, salario, 0.00001);

	}

	@Test
	public void deveCalcularSalarioParaDesenvolvedoresComSalarioAcimaDoLimite() {

		Funcionario desenvolvedor = new Funcionario("Mauricio", 4000, Cargo.DESENVOLVEDOR);
		
		double salario = calc.calculaSalario(desenvolvedor);

		Assert.assertEquals(4000 * 0.8, salario, 0.00001);
	}

	@Test
	public void deveCalcularSalarioParaDBAsComSalarioAbaixoDoLimite() {

		Funcionario dba = new Funcionario("Goku", 500.0, Cargo.DBA);

		double salario = calc.calculaSalario(dba);

		Assert.assertEquals(500.0 * 0.85, salario, 0.00001);
	}

}
