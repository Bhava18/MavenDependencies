package com.test.Batch2Maven;

import org.testng.annotations.Test;

public class DemoTest extends DriverClass {
	@Test
	public void run() {
		DemoQa demoqa=new DemoQa();
		demoqa.rundemo(driver);
		demoqa.search();
		
	}

}
