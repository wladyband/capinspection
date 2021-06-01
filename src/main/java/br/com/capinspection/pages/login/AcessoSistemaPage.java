package br.com.capinspection.pages.login;

import org.openqa.selenium.By;

import br.com.capinspection.core.BasePage;

public class AcessoSistemaPage extends BasePage {
	
	private static final String      botaoPadrao                        = "//button[@class='btn btn-primary']";
	private static final String      textoPorXpathUserName              = "//input[@id='login_form_type_username']";
	private static final String      clicarBotaoUserNameXpath           = "(//button)[1][@class='btn btn-block btn-success']";
	private static final String      clicarBotaoPasswordXpath           = "(//button)[2][@class='btn btn-block btn-success']";
	private static final String      userNamePorXPath                   = "//input[@id='login_form_type_username']";
	private static final String      passwordPorID                      = "login_form_type_password";
	

	public void clicaBotao() {
		dsl.clicarButton(By.xpath(botaoPadrao));
	}
			
	public void setCPF(String login) {
		dsl.escrever(By.xpath(userNamePorXPath), login);
	}
	
	public void setPassword(String password) {
		dsl.escrever(By.id(passwordPorID), password);
	}
	
	public void clicarBotaoUserName() {
		dsl.clicarButton(By.xpath(clicarBotaoUserNameXpath));
	}
	
	public void clicarBotaoPassword() {
		dsl.clicarButton(By.xpath(clicarBotaoPasswordXpath));
	}
	
	public String obterTextoPorXpathUserName() {
		return dsl.obterTexto(By.xpath(textoPorXpathUserName)).getAttribute("value");
	}
	
	public String obterTituloLoginCidadaoPorTag() {
		return dsl.obterTexto(By.tagName("h1")).getText();
	}
	public String obterTituloGTCPorTag() {
		esperaGTC();
		 return dsl.obterTexto(By.tagName("h5")).getText();
 	}
	
	public void esperaGTC() {
		dsl.esperaSugestivaGenerica(10, By.xpath("(//button)[8][@class='btn btn-sm btn-primary']"));
		
	}
}
