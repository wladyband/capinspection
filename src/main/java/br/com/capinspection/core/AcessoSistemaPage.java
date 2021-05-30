package br.com.capinspection.core;

public class AcessoSistemaPage {
	
	
	private DSL dsl;

	private static String      botaoPadrao                        = "//button[@class='btn btn-primary']";
	private static String      textoPorXpathUserName              = "//input[@id='login_form_type_username']";
	private static String      textoPorIDPassword                 = "//input[@id='login_form_type_password']";
	private static String      clicarBotaoUserNameXpath           = "(//button)[1][@class='btn btn-block btn-success']";
	private static String      clicarBotaoPasswordXpath           = "(//button)[2][@class='btn btn-block btn-success']";
	private static String      userNamePorXPath                   = "//input[@id='login_form_type_username']";
	private static String      passwordPorID                      = "login_form_type_password";
	
	public AcessoSistemaPage() {
		dsl = new DSL();
	}

	public void clicaBotao() {
		dsl.clicarButtonXpath(botaoPadrao);
	}
	
	public void setUserNamePorXpath(String login) {
		dsl.escreverPorXpath(userNamePorXPath, login);
	}
	
	public void setPasswordPorID(String password) {
		dsl.escreverPorID(passwordPorID, password);
	}
	
	public void clicarBotaoUserName() {
		dsl.clicarButtonXpath(clicarBotaoUserNameXpath);
	}
	
	public void clicarBotaoPassword() {
		dsl.clicarButtonXpath(clicarBotaoPasswordXpath);
	}
	
	public String obterTextoPorXpathUserName() {
		return dsl.obterTextoPorXpath(textoPorXpathUserName);
	}
	
	public String obterTextoPorIDPassword() {
		return dsl.obterTextoPorXpath(textoPorIDPassword);
	}
	
}
