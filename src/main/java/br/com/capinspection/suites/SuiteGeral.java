package br.com.capinspection.suites;

import static br.com.capinspection.core.DriverFactory.killDriver;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.capinspection.tests.TestandoLogin;

@RunWith(Suite.class)
@SuiteClasses({ TestandoLogin.class })
public class SuiteGeral {
	
	@AfterClass
	public static void finalizarTudo() {
		killDriver();
	}

}
