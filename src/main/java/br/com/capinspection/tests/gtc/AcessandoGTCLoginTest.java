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
			page.clicaBotao();
	}

	@Test
	public void t2_deveInserirLoginCidadaoGTC() throws InterruptedException {
		
			page.setCPF("727.585.220-98");
			page.clicarBotaoUserName();
			assertEquals("Já tenho cadastro no Login Cidadão", page.obterTituloLoginCidadaoPorTag());
		
	}

	@Test
	public void t2_deveInserirPasswordLoginCidadaoGTC() throws InterruptedException {
			page.setPassword("PROCERGSRU1");
			page.clicarBotaoPassword();
			assertEquals("Importante:", page.obterTituloGTCPorTag());
		
	}
}
