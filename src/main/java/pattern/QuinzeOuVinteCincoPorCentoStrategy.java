package pattern;

import entity.Funcionario;

public class QuinzeOuVinteCincoPorCentoStrategy implements
		RegraDeCalculoStrategy {
	@Override
	public double calcula(Funcionario f) {
		if (f.getSalario() < 2500) {
			return f.getSalario()*0.85;
		}
		return f.getSalario() * 0.75;
	}
}
