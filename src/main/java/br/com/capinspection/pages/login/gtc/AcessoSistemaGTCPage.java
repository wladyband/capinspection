package br.com.capinspection.pages.login.gtc;

import static br.com.capinspection.core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import br.com.capinspection.core.BasePage;

public class AcessoSistemaGTCPage extends BasePage {
	
	private static final String      acessoSiteGTC                      = "http://gtc02.tef.intra.rs.gov.br/pagina-inicial";
	private static final String      acessoSiteSOE                                = "https://soe.intra.rs.gov.br/soeauth-tef/connect/authorize?"
			+ "response_type=code&scope=openid&client_id=gtc.i2.tef.sDhOV3lzhNpoA1tEx5t&redirect_uri=http://"
			+ "gtc02.tef.intra.rs.gov.br/openid/callback/soe&state=ag9ud05l5nc22fug4fgcvg4q12&nonce="
			+ "bmnnt66e8p3jhsbh2njivhl0ek&code_challenge="
			+ "DCkp8timiLt4_qmJFFYePb6l3IWTGKx1oHWqFFAL7iw&code_challenge_method=S256";
	
	private static final String      botaoPadrao                        = "//button[@class='btn btn-primary']";
	private static final String      textoPorXpathUserName              = "//input[@id='login_form_type_username']";
	private static final String      clicarBotaoUserNameXpath           = "(//button)[1][@class='btn btn-block btn-success']";
	private static final String      clicarBotaoPasswordXpath           = "(//button)[2][@class='btn btn-block btn-success']";
	private static final String      userNamePorXPath                   = "//input[@id='login_form_type_username']";
	private static final String      passwordPorID                      = "login_form_type_password";
	

	public void acessarTelaInicialGTC() {
		getDriver().get(acessoSiteGTC);
		clicaBotao();
	}
	
	public void acessarTelaInicialSOE() {
		getDriver().get(acessoSiteSOE);
	}
	
	public void clicaBotao() {
		clicarButton(By.xpath(botaoPadrao));
	}
			
	public void setCPF(String login) {
		escrever(By.xpath(userNamePorXPath), login);
	}
	
	public void setPassword(String password) throws InterruptedException {
		Thread.sleep(300);
		escrever(By.id(passwordPorID), password);
	}
	
	public void clicarBotaoUserName() {
		clicarButton(By.xpath(clicarBotaoUserNameXpath));
	}
	
	public void clicarBotaoPassword() throws InterruptedException {
		Thread.sleep(300);
		clicarButton(By.xpath(clicarBotaoPasswordXpath));
	}
	
	public String obterTextoPorXpathUserName() {
		return obterTexto(By.xpath(textoPorXpathUserName)).getAttribute("value");
	}
	
	public String obterTituloLoginCidadaoPorTag() {
		return obterTexto(By.tagName("h1")).getText();
	}
	public String obterTituloGTCPorTag() {
		esperaGTC(10);
		 return obterTexto(By.tagName("h5")).getText();
 	}
	
	public void esperaGTC(int valor) {
		esperaSugestivaGenerica(valor, By.xpath("(//button)[8][@class='btn btn-sm btn-primary']"));
	}

}
