package br.com.capinspection.core;

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
	
	public String obterTextoPorXpath(String xpath) {
		return driver.findElement(By.xpath(xpath)).getAttribute("value");
	}
	
	public void escreverPorXpath(String id_campo, String texto) {
		driver.findElement(By.xpath(id_campo)).sendKeys(texto);
	}
	
	public void escrever(String id_campo, String texto) {
		driver.findElement(By.id(id_campo)).sendKeys(texto);
	}
}
