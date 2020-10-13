package com.grid.testcases;


import org.testng.annotations.Test;

import com.grid.pages.BaseClass;
import com.grid.pages.LoginPage;
import com.grid.utilities.ConfigDataProvider;

public class LoginToGrid extends BaseClass{
	
	@Test
	public void LoginToGridAs() throws InterruptedException {
		LoginPage loginPage = new LoginPage();
		ConfigDataProvider config = new ConfigDataProvider();
		loginPage.LoginToGrid(config.getOrgID(), config.getUsrname(), config.getpassword());
	}
	

}
