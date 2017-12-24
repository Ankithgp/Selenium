package Begining;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String driverpath = "F:\\Drivers\\chromedriver_win32\\" ;
		System.setProperty("webdriver.chrome.driver", "F:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://lionsgate.clearhub.tv/");
		/*String actual="";
		actual = driver.getTitle();
		System.out.println("Title of the page"+actual); 
		String tagname="";
		
		tagname = driver.findElement(By.id("x-username")).getTagName();
		System.out.println("tgname is " +tagname);*/
		String page = "";
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		page = driver.findElement(By.id("x-username")).getText();//sendKeys("Ankith_Screenerpublisher",Keys.ENTER);
		//login.sendKeys("Ankith_Screenerpublisher");
		//driver.findElement(By.id("loginContinue")).click();
		
		//driver.findElement(By.id("x-username")).sendKeys("ankith_fulfillmentadmin",Keys.ENTER);
		
		/*WebElement psw = driver.findElement(By.id("x-pwd"));
		psw.sendKeys("Google#123");
		driver.findElement(By.id("loginSubmit")).click(); */
		 
		//page = driver.findElement(By.id("x-username")).getText();
		System.out.println(page);
		//driver.quit();
	}

}
