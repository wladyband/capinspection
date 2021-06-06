package br.com.capinspection.core;

import static br.com.capinspection.core.DriverFactory.getDriver;
import static br.com.capinspection.core.DriverFactory.killDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import br.com.capinspection.pages.login.gtc.AcessoSistemaGTCPage;

public class BaseTest {

	@Rule
	public TestName testName = new TestName();

	private AcessoSistemaGTCPage page = new AcessoSistemaGTCPage();


	public void inicializarGTC() throws InterruptedException {
			page.acessarTelaInicialGTC();
			page.setCPF("727.585.220-98");
			page.clicarBotaoUserName();
			page.setPassword("PROCERGSRU1");
			page.clicarBotaoPassword();
	}
	
	public void inicializarSOE() {
		page.acessarTelaInicialSOE();
		page.setOrganizacaoSOE("DAER");
		page.setNumeroMatriculaSOE("123");
		page.setSenhaSOE("senha123");
		page.clicaBotaoSOE();
	}

	@After
	public void finalizarTestes() throws IOException {
		TakesScreenshot takesScreenshot = (TakesScreenshot) getDriver();
		File arquivo = takesScreenshot.getScreenshotAs(OutputType.FILE);
		if (Propriedades.GTC_INICIADO == true) {
			FileUtils.copyFile(arquivo, new File(
					"target" + File.separator + "screenshotLoginCidadao" + File.separator + testName.getMethodName() + ".jpg"));

			if (Propriedades.FECHAR_BROWSER) {
				killDriver();
			}

		}
		
		if (Propriedades.SOE_INICIADO == true) {
			FileUtils.copyFile(arquivo, new File(
					"target" + File.separator + "screenshotSOE" + File.separator + testName.getMethodName() + ".jpg"));

			if (Propriedades.FECHAR_BROWSER) {
				killDriver();
			}
		}
		if(Propriedades.GTC_INICIADO == true) {
			Propriedades.GTC_INICIADO = false;
		}
		if(Propriedades.SOE_INICIADO == true) {
			Propriedades.SOE_INICIADO = false;
		}
	}
	

}
