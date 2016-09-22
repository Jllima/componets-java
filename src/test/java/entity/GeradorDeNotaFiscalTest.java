package entity;

import java.util.Arrays;
import java.util.List;

import model.AcaoAposGerarNota;
import model.GeradorDeNotaFiscal;

import org.junit.Test;
import org.mockito.Mockito;

public class GeradorDeNotaFiscalTest {
	@Test
	public void deveInvocarAcoesPosteriores() {
		AcaoAposGerarNota acao1 = Mockito.mock(AcaoAposGerarNota.class);
		AcaoAposGerarNota acao2 = Mockito.mock(AcaoAposGerarNota.class);

		List<AcaoAposGerarNota> acoes = Arrays.asList(acao1, acao2);

		GeradorDeNotaFiscal gerador = new GeradorDeNotaFiscal(acoes);
		Pedido pedido = new Pedido("Mauricio", 1000, 1);
		NotaFiscal nf = gerador.gera(pedido);

		Mockito.verify(acao1).executa(nf);
		Mockito.verify(acao2).executa(nf);
	}

}
