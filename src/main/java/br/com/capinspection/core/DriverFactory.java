package br.com.capinspection.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import br.com.capinspection.core.Propriedades.Sistemas;

public class DriverFactory {

	private static WebDriver driver;
	private static final String      GTC     = "http://gtc02.tef.intra.rs.gov.br/pagina-inicial";
	private static final String      SOE     = "https://soe.intra.rs.gov.br/soeauth-tef/connect/authorize?"
			+ "response_type=code&scope=openid&client_id=gtc.i2.tef.sDhOV3lzhNpoA1tEx5t&redirect_uri=http://"
			+ "gtc02.tef.intra.rs.gov.br/openid/callback/soe&state=ag9ud05l5nc22fug4fgcvg4q12&nonce="
			+ "bmnnt66e8p3jhsbh2njivhl0ek&code_challenge="
			+ "DCkp8timiLt4_qmJFFYePb6l3IWTGKx1oHWqFFAL7iw&code_challenge_method=S256";
	

	private DriverFactory() {
	}

	public static WebDriver getDriver() {
		if (driver == null) {
			switch (Propriedades.browser) {
			case FIREFOX:
				System.setProperty("webdriver.gecko.driver", "src/main/resources/drivers/geckodriver.exe");
				driver = new FirefoxDriver();
				break;
			case CHROME:
				System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
				driver = new ChromeDriver();
				break;
			case IE:
				System.setProperty("webdriver.ie.driver", "src/main/resources/drivers/IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				break;
			}
		}
		return driver;
	}

	public static void killDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}

}
