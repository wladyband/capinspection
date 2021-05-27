package teste;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DSL {
	
	private WebDriver driver;
	
	public DSL(WebDriver driver) {
		this.driver = driver;
	}

	
	public void clicarButtonXpath(String link) {
		driver.findElement(By.xpath(link)).click();
	}
	
	public String obterTextoPelaTag(String id) {
		return driver.findElement(By.className(id)).getText();
	}
}
