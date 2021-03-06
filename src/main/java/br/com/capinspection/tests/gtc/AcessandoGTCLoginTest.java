package br.com.capinspection.tests.gtc;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.com.capinspection.core.BaseTest;
import br.com.capinspection.core.Propriedades;
import br.com.capinspection.pages.login.gtc.AcessoSistemaGTCPage;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AcessandoGTCLoginTest extends BaseTest {

	private AcessoSistemaGTCPage page;

	@Before
	public void inicializarTestes() throws InterruptedException {
		inicializarGTC();
		Propriedades.GTC_INICIADO = true;
		page = new AcessoSistemaGTCPage();
	}

	@Test
	public void t1_analiseAcessoSistemaGTC() throws InterruptedException {
			assertEquals("Importante:", page.obterTituloGTCPorTag());
	}

}
