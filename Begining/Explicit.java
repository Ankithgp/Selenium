package Begining;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
       /* WebDriverWait abc = new WebDriverWait(driver,50);		
        driver.get("https://lionsgate.clearhub.tv/bc");
        abc.until(ExpectedConditions.visibilityOfElementLocated(By.id("x-username")));
        driver.findElement(By.id("x-username")).sendKeys("ankith_fulfillmentadmin", Keys.ENTER); */
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://lionsgate.clearhub.tv/bc");		
		//WebElement box = driver.findElement(By.id("x-login"));
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		try{
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("x-login")));
			driver.findElement(By.id("x-login")).sendKeys("ABC");
			 }
		catch(NoSuchElementException nsee){
				 System.out.println(nsee.toString());
			 }
         

	}

}
