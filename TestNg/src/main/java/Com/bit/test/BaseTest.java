package Com.bit.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BaseTest {
  @Test
  public void f() {
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("bc");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("am");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("bc");
  }
  

  @AfterClass
  public void afterClass() {
	  System.out.println("ac")
	  
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("bt")
	  
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
