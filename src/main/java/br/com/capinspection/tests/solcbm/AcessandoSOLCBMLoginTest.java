package br.com.capinspection.tests.solcbm;

import static br.com.capinspection.core.URLFactory.getURL;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.com.capinspection.core.BaseTest;
import br.com.capinspection.core.SwitchHubURL;
import br.com.capinspection.core.SwitchHubURL.URL;
import br.com.capinspection.pages.login.gtc.AcessoSistemaGTCPage;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AcessandoSOLCBMLoginTest extends BaseTest {

	private AcessoSistemaGTCPage page;

	@Before
	public void inicializarTestes() {
		page = new AcessoSistemaGTCPage();
	}

	@Test
	public void t1_deveClicarEntrarLoginCidadaoSOLCBM() throws InterruptedException {
		if (URL.SOLCBM == SwitchHubURL.uRL) {
			getURL();
			page.clicaBotao();
		}
	}

	@Test
	public void t2_deveInserirLoginCidadaoSOLCBM() throws InterruptedException {
		if (URL.SOLCBM == SwitchHubURL.uRL) {
//			page.setCPF("727.585.220-98");
//			page.clicarBotaoUserName();
//			assertEquals("Já tenho cadastro no Login Cidadão", page.obterTituloLoginCidadaoPorTag());
		}
	}

	@Test
	public void t2_deveInserirPasswordLoginCidadaoSOLCBM() throws InterruptedException {
		if (URL.SOLCBM == SwitchHubURL.uRL) {
//			page.setPassword("PROCERGSRU1");
//			page.clicarBotaoPassword();
//			assertEquals("Importante:", page.obterTituloGTCPorTag());
		}
	}
}
