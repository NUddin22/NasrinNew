package db;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DBTest {
	@DataProvider(name="login")
	public Obiect[][] getData(){
		Object [][]o=new Object[2][2];
		o[0][0]="user1";
		o[0][1]="P23";
		o[1][0]="user1";
		o[1][1]="P23";
		return o;
		
	}

	
	}

