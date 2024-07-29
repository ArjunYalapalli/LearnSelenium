package utilities;

import org.junit.Before;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;

public class HooksFile {
	@Before
	public void setup() {
		System.out.println("browser got opened");
	}

	@After
	public void teardown() {
		System.out.println("Browser got closed");
	}

	@BeforeStep
	public void beforeStep() {
		System.out.println("before every step");
	}

	@AfterStep
	public void afterStep() {
		System.out.println("after every step");
	}

}
