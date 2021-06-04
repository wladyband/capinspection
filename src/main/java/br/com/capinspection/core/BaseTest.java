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
		page.acessarTelaInicial();
		page.inserirCPF();
		page.clicarBotaoUserName();
		page.inserirPassword();
		page.clicarBotaoPassword();
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
