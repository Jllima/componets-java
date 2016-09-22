package enums;

import pattern.DezOuVintePorCentoStrategy;
import pattern.QuinzeOuVinteCincoPorCentoStrategy;
import pattern.RegraDeCalculoStrategy;

public enum Cargo {
	DESENVOLVEDOR(new DezOuVintePorCentoStrategy()), DBA(
			new QuinzeOuVinteCincoPorCentoStrategy()), TESTADOR(
			new QuinzeOuVinteCincoPorCentoStrategy());

	private final RegraDeCalculoStrategy regra;

	Cargo(RegraDeCalculoStrategy regra) {
		this.regra = regra;
	}

	public RegraDeCalculoStrategy getRegra() {
		return regra;
	}
}
