package br.com.capinspection.core;

import static br.com.capinspection.core.DriverFactory.getDriver;
import static br.com.capinspection.core.DriverFactory.killDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import br.com.capinspection.pages.login.gtc.AcessoSistemaGTCPage;

public class BaseTest {

	@Rule
	public TestName testName = new TestName();

	private AcessoSistemaGTCPage page = new AcessoSistemaGTCPage();

	@Before
	public void inicializar() throws InterruptedException {
		if (Propriedades.Autenticacao.GTC == Propriedades.sistema) {
			page.acessarTelaInicialGTC();
			page.setCPF("727.585.220-98");
			page.clicarBotaoUserName();
			page.setPassword("PROCERGSRU1");
			page.clicarBotaoPassword();
		
		} else {
			page.acessarTelaInicialSOE();
		}
	}

	@After
	public void finalizarTestes() throws IOException {
		TakesScreenshot takesScreenshot = (TakesScreenshot) getDriver();
		File arquivo = takesScreenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(arquivo, new File(
				"target" + File.separator + "screenshot" + File.separator + testName.getMethodName() + ".jpg"));

		if (Propriedades.FECHAR_BROWSER) {
			killDriver();
		}
	}

}
