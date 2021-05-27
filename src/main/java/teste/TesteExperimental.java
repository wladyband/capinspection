package teste;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
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
	public void deveEntrarLoginCidadao() {
		dsl.clicarButtonXpath("//button[@class='btn btn-primary']");
		Assert.assertEquals("J� tenho cadastro no Login Cidad�o", dsl.obterTextoPelaTag("title"));
	}

}
