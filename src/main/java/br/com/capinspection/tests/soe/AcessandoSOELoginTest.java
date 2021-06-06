package br.com.capinspection.tests.soe;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.com.capinspection.core.BaseTest;
import br.com.capinspection.core.Propriedades;
import br.com.capinspection.pages.login.gtc.AcessoSistemaGTCPage;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AcessandoSOELoginTest extends BaseTest {

	private AcessoSistemaGTCPage page;

	@Before
	public void inicializarTestes() throws InterruptedException {
		inicializarSOE();
		Propriedades.SOE_INICIADO = true;
		page = new AcessoSistemaGTCPage();
	}

	@Test
	public void t1_analiseAcessoSistemaSOE() throws InterruptedException {
			
	}

}
