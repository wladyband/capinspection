package teste;

import static br.com.capinspection.core.DriverFactory.getDriver;
import static br.com.capinspection.core.DriverFactory.killDriver;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.capinspection.core.DSL;

public class TestandoLogin {

	private DSL dsl;

	@Before
	public void inicializarTestes() {
		dsl = new DSL();
	}

	@After
	public void finalizarTestes() {
		killDriver();
	}

	@Test
	public void deveEntrarLoginCidadao() throws InterruptedException {
		getDriver().get("http://gtc02.tef.intra.rs.gov.br/pagina-inicial");
		dsl.clicarButtonXpath("//button[@class='btn btn-primary']");
		assertEquals("Já tenho cadastro no Login Cidadão", dsl.obterTextoPelaTag("title"));
		dsl.escreverPorXpath("//input[@id='login_form_type_username']", "727.585.220-98");
		assertEquals("727.585.220-98", dsl.obterTextoPorXpath("//input[@id='login_form_type_username']"));
		dsl.clicarButtonXpath("(//button)[1][@class='btn btn-block btn-success']");
		Thread.sleep(300);
		dsl.escrever("login_form_type_password", "PROCERGSRU1");
		assertEquals("PROCERGSRU1", dsl.obterTextoPorXpath("//input[@id='login_form_type_password']"));
		dsl.clicarButtonXpath("(//button)[2][@class='btn btn-block btn-success']");
	}
}
