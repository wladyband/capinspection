package teste;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteExperimental {
	
	@Test
	public void deveEntrarLoginCidadao() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://gtc02.tef.intra.rs.gov.br/pagina-inicial");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Assert.assertEquals("Já tenho cadastro no Login Cidadão", driver.findElement(By.className("title")).getText());
		driver.quit();
	}

	
}
