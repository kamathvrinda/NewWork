package com.grid.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	@FindBy(css = "div:nth-child(1) > input")
	WebElement OrganisationID;
	@FindBy(css = "div:nth-child(2) > input")
	WebElement UserName;
	@FindBy(css = "input[type='password']")
	WebElement Password;
	@FindBy(css = "submit")
	WebElement LoginBtn;
	
	
	public void LoginToGrid(String orgID,String usrname,String password) {
		OrganisationID.sendKeys(orgID);
		UserName.sendKeys(usrname);
		Password.sendKeys(password);
		LoginBtn.click();
	}
	

}
