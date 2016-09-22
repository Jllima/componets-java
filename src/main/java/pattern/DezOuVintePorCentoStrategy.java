package pattern;

import entity.Funcionario;

public class DezOuVintePorCentoStrategy implements RegraDeCalculoStrategy {
	@Override
	public double calcula(Funcionario f) {
		if (f.getSalario() > 3000) {
			return f.getSalario() * 0.8;
		}
		return f.getSalario() * 0.9;
	}
}
