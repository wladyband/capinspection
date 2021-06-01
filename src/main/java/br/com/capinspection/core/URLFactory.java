package br.com.capinspection.core;

import br.com.capinspection.core.SwitchHubURL.URL;

public class URLFactory {

	private URLFactory() {
	}

	public static URL getURL() {
		switch (SwitchHubURL.uRL) {
		case GTC:
			DriverFactory.getDriver().get("http://gtc02.tef.intra.rs.gov.br/pagina-inicial");
			break;
		case SOLCBM:
			DriverFactory.getDriver().get("https://secweb.tef.intra.rs.gov.br/solcbm/");
			break;

		}
		return SwitchHubURL.uRL;

	}

}
