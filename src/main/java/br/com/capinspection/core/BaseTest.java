package br.com.capinspection.core;

import static br.com.capinspection.core.DriverFactory.killDriver;

import org.junit.After;

public class BaseTest {
	
	@After
	public void finalizarTestes() {
		killDriver();
	}

}
