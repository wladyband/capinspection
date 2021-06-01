package br.com.capinspection.core;

import static br.com.capinspection.core.DriverFactory.getDriver;
import org.openqa.selenium.By;

/*https://www.red-gate.com/simple-talk/development/dotnet-development/xpath-css-dom-and-selenium-the-rosetta-stone/*/

public class DSL {
	
	public void clicarButton(By by) {
		getDriver().findElement(by).click();
	}
	
	public String obterTexto(By by) {
		return getDriver().findElement(by).getAttribute("value");
	}
	
	public void escrever(By by, String texto) {
		getDriver().findElement(by).sendKeys(texto);
	}
}
