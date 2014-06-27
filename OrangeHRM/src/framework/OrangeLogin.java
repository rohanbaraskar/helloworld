package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import tests.LoginPageTestCases;



public class OrangeLogin   {
	
	static WebDriver driver = new FirefoxDriver();

	public static  void login(String a, String b) {
		
		 
		 
		 driver.get("http://127.0.0.1/orangehrm-3.0.1/symfony/web/index.php/auth/login");
		 
		driver.findElement(By.id("txtUsername")).sendKeys(a);
		
		driver.findElement(By.id("txtPassword")).sendKeys(b);
		
		driver.findElement(By.id("btnLogin")).submit();
		
		
		
	}

	public static String getUsername() {
		String username;
		WebElement a= driver.findElement(By.id("welcome"));
		username = a.getText();
		
		return username;
	}
	

}
