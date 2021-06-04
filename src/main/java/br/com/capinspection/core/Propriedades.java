package br.com.capinspection.core;

public class Propriedades {

	public static boolean FECHAR_BROWSER = false;

	public static Browsers browser = Browsers.CHROME;

	public static Sistemas sistemas = Sistemas.SOE;

	public enum Browsers {
		CHROME, FIREFOX, IE
	}

	public enum Sistemas {
		SOE, GTC
	}
}
