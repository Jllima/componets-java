package entity;

import enums.Cargo;

public class CalculadoraDeSalarios {

	public double calculaSalario(Funcionario funcionario) {

		if (funcionario.getCargo().equals(Cargo.DESENVOLVEDOR)) {
			if (funcionario.getSalario() > 3000)
				return funcionario.getSalario() * 0.8;
			return funcionario.getSalario() * 0.9;
		}
		return funcionario.getSalario() * 0.85;

	}

}
