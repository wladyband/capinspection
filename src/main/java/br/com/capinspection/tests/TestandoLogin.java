package br.com.capinspection.tests;

import static br.com.capinspection.core.DriverFactory.getDriver;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.com.capinspection.core.BaseTest;
import br.com.capinspection.core.DSL;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestandoLogin extends BaseTest {

	private DSL dsl;

	@Before
	public void inicializarTestes() {
		dsl = new DSL();
	}

	@Test
	public void t1_deveClicarEntrarLoginCidadao() throws InterruptedException {
		getDriver().get("http://gtc02.tef.intra.rs.gov.br/pagina-inicial");
		dsl.clicarButtonXpath("//button[@class='btn btn-primary']");
		
	}
	
	@Test
	public void t2_deveInserirLoginCidadao() throws InterruptedException {
		dsl.escreverPorXpath("//input[@id='login_form_type_username']", "727.585.220-98");
		assertEquals("727.585.220-98", dsl.obterTextoPorXpath("//input[@id='login_form_type_username']"));
		dsl.clicarButtonXpath("(//button)[1][@class='btn btn-block btn-success']");
		Thread.sleep(300);
	}
	
	@Test
	public void t2_deveInserirPasswordLoginCidadao() throws InterruptedException {
		dsl.escrever("login_form_type_password", "PROCERGSRU1");
		assertEquals("PROCERGSRU1", dsl.obterTextoPorXpath("//input[@id='login_form_type_password']"));
		dsl.clicarButtonXpath("(//button)[2][@class='btn btn-block btn-success']");
	}
}
