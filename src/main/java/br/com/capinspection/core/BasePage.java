package br.com.capinspection.core;

import static br.com.capinspection.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	public void clicarButton(By by) {
		getDriver().findElement(by).click();
	}
	
	public WebElement obterTexto(By by) {
		return getDriver().findElement(by);
	}
	
	public void escrever(By by, String texto) {
		getDriver().findElement(by).sendKeys(texto);
	}
	
	public void esperaSugestivaGenerica(int time, By by) {
		WebDriverWait wait = new WebDriverWait(getDriver(), time);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

}
