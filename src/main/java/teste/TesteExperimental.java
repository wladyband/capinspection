package teste;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteExperimental {

	private WebDriver driver;
	private DSL dsl;

	@Before
	public void inicializarTestes() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://gtc02.tef.intra.rs.gov.br/pagina-inicial");
		dsl = new DSL(driver);
	}

	@After
	public void finalizarTestes() {
		driver.quit();
	}

	@Test
	public void deveEntrarLoginCidadao() throws InterruptedException {
		dsl.clicarButtonXpath("//button[@class='btn btn-primary']");
		Assert.assertEquals("Já tenho cadastro no Login Cidadão", dsl.obterTextoPelaTag("title"));
		dsl.escreverPorXpath("//input[@id='login_form_type_username']", "727.585.220-98");
		Assert.assertEquals("727.585.220-98", dsl.obterTextoPorXpath("//input[@id='login_form_type_username']"));
		dsl.clicarButtonXpath("(//button)[1][@class='btn btn-block btn-success']");
	    Thread.sleep(200);
		dsl.escrever("login_form_type_password", "PROCERGSRU1");
		Assert.assertEquals("PROCERGSRU1", dsl.obterTextoPorXpath("//input[@id='login_form_type_password']"));
	}
}
