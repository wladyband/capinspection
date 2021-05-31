package br.com.capinspection.tests;

import static br.com.capinspection.core.URLFactory.getURL;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.com.capinspection.core.AcessoSistemaPage;
import br.com.capinspection.core.BaseTest;

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
		page.setUserNamePorXpath("727.585.220-98");
		assertEquals("727.585.220-98", page.obterTextoPorXpathUserName());
		page.clicarBotaoUserName();
		Thread.sleep(300);
	}
	
	@Test
	public void t2_deveInserirPasswordLoginCidadao() throws InterruptedException {
		page.setPasswordPorID("PROCERGSRU1");
		assertEquals("PROCERGSRU1", page.obterTextoPorIDPassword());
		page.clicarBotaoPassword();
	}
	
}
