package com.test.Batch2Maven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestCase {
  @Test
  public void Test() {
//	 GitHub git=new GitHub() ;
//	 git.login();
	  DemoQa demo=new DemoQa();
	  demo.rundemo(null);
	  demo.search();
	  
  }
  
  @BeforeMethod
  public void beforeMethod()
  {
//   OpenGooglePages ops= new OpenGooglePages();
//   ops.amgs();
  }

  @AfterMethod
  public void afterMethod() {
//	  Google google=new Google();
//	  google.selenium();
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
