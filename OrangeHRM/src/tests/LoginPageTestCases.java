package tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import framework.Admin;
import framework.OrangeLogin;

public class LoginPageTestCases {
	
	
	
	
	@Test(priority = 1)
	public void AdminCanLogin(){
		
		OrangeLogin.login("rohan123","therock");
		Assert.assertEquals(OrangeLogin.getUsername(), "Welcome Admin");
		
	}
	
	@Test(priority = 2)
	public void AdminCanAddUser(){
		boolean z= Admin.addUser("employee1 test","therock");
		Assert.assertTrue(z);
	}

}
