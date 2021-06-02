package br.com.capinspection.tests.gtc;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.com.capinspection.core.BaseTest;
import br.com.capinspection.pages.login.gtc.AcessoSistemaGTCPage;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AcessandoGTCLoginTest extends BaseTest {

	private AcessoSistemaGTCPage page;

	@Before
	public void inicializarTestes() {
		page = new AcessoSistemaGTCPage();
	}

	@Test
	public void t1_deveClicarEntrarLoginCidadaoGTC() throws InterruptedException {
		assertEquals("Já tenho cadastro no Login Cidadão", page.obterTituloLoginCidadaoPorTag());
		assertEquals("Importante:", page.obterTituloGTCPorTag());
	}

}
