package model;

import java.util.Calendar;
import java.util.List;

import entity.NotaFiscal;
import entity.Pedido;

public class GeradorDeNotaFiscal {

	private final List<AcaoAposGerarNota> acoes;

	public GeradorDeNotaFiscal(List<AcaoAposGerarNota> acoes) {
		this.acoes = acoes;
	}

	public NotaFiscal gera(Pedido pedido) {
		NotaFiscal nf = new NotaFiscal(pedido.getCliente(),
				pedido.getValorTotal() * 0.94, Calendar.getInstance());
		for (AcaoAposGerarNota acao : acoes) {
			acao.executa(nf);
		}
		return nf;
	}

}
