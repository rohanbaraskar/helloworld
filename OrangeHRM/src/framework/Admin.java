package framework;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import tests.LoginPageTestCases;

public class Admin extends OrangeLogin {
	


	public static boolean addUser(String a,String b) {
		
		//to find no of rows before adding
		
		int rowCountOld = driver.findElements(By.xpath("//table[@id='DataTable']/tbody/tr")).size();
		System.out.println("number of user before addition="+rowCountOld);
		
	driver.findElement(By.linkText("Admin")).click();
	
	driver.findElement(By.id("btnAdd")).click();
	//user role dropdown
	
	
	Select droplist = new Select(driver.findElement(By.id("systemUser_userType")));   
	droplist.selectByVisibleText("ESS");
	driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys(a);
	driver.findElement(By.id("systemUser_userName")).sendKeys(a);
	driver.findElement(By.id("systemUser_password")).sendKeys(b);
	driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(b);
	
	driver.findElement(By.id("addbutton")).click();
	
	int rowCountnew = driver.findElements(By.xpath("//table[@id='DataTable']/tbody/tr")).size();
	System.out.println("number of user before addition="+rowCountnew);
	boolean status;
	if (rowCountOld<rowCountnew){
		System.out.println("Test case pass newly added row");
		
		status= true;
	}	else status = false;
	 return status;
	
		
	
	}
	

}
