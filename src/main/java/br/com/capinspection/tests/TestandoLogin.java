package br.com.capinspection.tests;

import static br.com.capinspection.core.URLFactory.getURL;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.com.capinspection.core.BaseTest;
import br.com.capinspection.core.SwitchHubURL;
import br.com.capinspection.core.SwitchHubURL.URL;
import br.com.capinspection.pages.login.AcessoSistemaPage;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestandoLogin extends BaseTest {

	
	private AcessoSistemaPage page;

	@Before
	public void inicializarTestes() {
		page = new AcessoSistemaPage();
	}

	@Test
	public void t1_deveClicarEntrarLoginCidadao() throws InterruptedException {
		getURL();
		page.clicaBotao();
	}
	
	@Test
	public void t2_deveInserirLoginCidadao() throws InterruptedException {
		if(URL.GTC == SwitchHubURL.uRL ) {
			page.setCPF("727.585.220-98");
			page.clicarBotaoUserName();
			assertEquals("Já tenho cadastro no Login Cidadão", page.obterTituloLoginCidadaoPorTag());
		}
		
	}
	
	@Test
	public void t2_deveInserirPasswordLoginCidadao() throws InterruptedException {
		page.setPassword("PROCERGSRU1");
		page.clicarBotaoPassword();
		assertEquals("Importante:", page.obterTituloGTCPorTag());
	}
	
}
