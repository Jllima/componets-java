package pattern;

import entity.Funcionario;


public interface RegraDeCalculoStrategy {
	double calcula(Funcionario f);
}
