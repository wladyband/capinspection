package br.com.capinspection.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.capinspection.tests.TestandoLogin;

@RunWith(Suite.class)
@SuiteClasses({ TestandoLogin.class })
public class SuiteGeral {

}
