package br.com.capinspection.core;

public class Propriedades {


	public static boolean FECHAR_BROWSER = false;

	public static Browsers browser = Browsers.CHROME;

	public static Autenticacao sistema = Autenticacao.SOE;

	public enum Browsers {
		CHROME, FIREFOX, IE
	}

	public enum Autenticacao {
		SOE, GTC
	}
}
