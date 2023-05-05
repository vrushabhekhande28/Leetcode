package TestNGTutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGExcel 
{
	
	 ChromeOptions option=new ChromeOptions();
     WebDriver driver;

     @DataProvider(name="test")
     public void excel()
     {
        	 
     }
     
     @BeforeMethod
     public void setup()
     {
       option.addArguments("remote-allow-origins=*");
       driver =new ChromeDriver(option);
       driver.get("https://demo.actitime.com/login.do");
     }
     
	 @Test(dataProvider="test")
     public void login(String name,String pass)
	 {   	   
	    driver.findElement(By.id("username")).sendKeys(name);
 	   driver.findElement(By.name("pwd")).sendKeys(pass);
	 }
	 
	 
}
