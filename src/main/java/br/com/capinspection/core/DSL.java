package br.com.capinspection.core;

import static br.com.capinspection.core.DriverFactory.getDriver;
import org.openqa.selenium.By;

/*https://www.red-gate.com/simple-talk/development/dotnet-development/xpath-css-dom-and-selenium-the-rosetta-stone/*/

public class DSL {
	
	public void clicarButtonXpath(String link) {
		getDriver().findElement(By.xpath(link)).click();
	}
	
	public String obterTextoPelaTag(String id) {
		return getDriver().findElement(By.className(id)).getText();
	}
	
	public String obterTextoPorXpath(String xpath) {
		return getDriver().findElement(By.xpath(xpath)).getAttribute("value");
	}
	
	public void escreverPorXpath(String id_campo, String texto) {
		getDriver().findElement(By.xpath(id_campo)).sendKeys(texto);
	}
	
	public void escreverPorID(String id_campo, String texto) {
		getDriver().findElement(By.id(id_campo)).sendKeys(texto);
	}
}
