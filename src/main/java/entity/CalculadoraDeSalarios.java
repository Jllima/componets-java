package entity;

import pattern.RegraDeCalculoStrategy;

public class CalculadoraDeSalarios {

	private RegraDeCalculoStrategy regra;

	public double calculaSalario(Funcionario funcionario) {
		return funcionario.getCargo().getRegra().calcula(funcionario);
	}

}
