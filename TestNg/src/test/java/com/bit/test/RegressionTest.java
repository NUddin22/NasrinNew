package com.bit.test;

import org.testng.annotations.Test;

import db.DBTest;

public class RegressionTest extends BaseTest {
		/*@Test(groups="ui")
		  public void test2() {
			 System.out.println("test2");
		  }
		@Test(groups={"ui","backend"})
		  public void test3() {
			 System.out.println("test3");
		  }*/
	//DataProvider using for the test
	/*@Test(dataProviderClass=DBTest.class,dataProvider="login")
	public void test5(Object b,Object c) {
	}*/
		

	@Parameters({"browser", "url"})
	@Test(groups="ui")
	  public void test2(String b, String u) {
		System.out.println("test2");
		if(b.equals("chrome")) {
			System.out.println("open chrome");
		}else if(b.equals("firefox")) {
			System.out.println("open firefox");
		}
	  }
	@Test(groups={"ui","backEnd"})
	  public void test3() {
		System.out.println("test3");
	  }

}

	 


