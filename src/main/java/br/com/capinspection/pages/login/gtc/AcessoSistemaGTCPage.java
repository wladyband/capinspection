package br.com.capinspection.pages.login.gtc;

import org.openqa.selenium.By;

import br.com.capinspection.core.BasePage;

public class AcessoSistemaGTCPage extends BasePage {
	
	private static final String      botaoPadrao                        = "//button[@class='btn btn-primary']";
	private static final String      textoPorXpathUserName              = "//input[@id='login_form_type_username']";
	private static final String      clicarBotaoUserNameXpath           = "(//button)[1][@class='btn btn-block btn-success']";
	private static final String      clicarBotaoPasswordXpath           = "(//button)[2][@class='btn btn-block btn-success']";
	private static final String      userNamePorXPath                   = "//input[@id='login_form_type_username']";
	private static final String      passwordPorID                      = "login_form_type_password";
	

	public void clicaBotao() {
		clicarButton(By.xpath(botaoPadrao));
	}
			
	public void setCPF(String login) {
		escrever(By.xpath(userNamePorXPath), login);
	}
	
	public void setPassword(String password) {
		escrever(By.id(passwordPorID), password);
	}
	
	public void clicarBotaoUserName() {
		clicarButton(By.xpath(clicarBotaoUserNameXpath));
	}
	
	public void clicarBotaoPassword() {
		clicarButton(By.xpath(clicarBotaoPasswordXpath));
	}
	
	public String obterTextoPorXpathUserName() {
		return obterTexto(By.xpath(textoPorXpathUserName)).getAttribute("value");
	}
	
	public String obterTituloLoginCidadaoPorTag() {
		return obterTexto(By.tagName("h1")).getText();
	}
	public String obterTituloGTCPorTag() {
		esperaGTC();
		 return obterTexto(By.tagName("h5")).getText();
 	}
	
	public void esperaGTC() {
		esperaSugestivaGenerica(10, By.xpath("(//button)[8][@class='btn btn-sm btn-primary']"));
		
	}
}
