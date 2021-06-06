package br.com.capinspection.core;

public class Propriedades {

	public static boolean FECHAR_BROWSER = false;
	public static boolean SOE_INICIADO = false;
	public static boolean GTC_INICIADO = false;
	
	public static Browsers browser = Browsers.CHROME;

	public enum Browsers {
		CHROME, FIREFOX, IE
	}

}
