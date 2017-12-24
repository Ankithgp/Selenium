package Begining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/selenium/deprecated.html");
		//driver.switchTo().frame("classFrame");
		//driver.switchTo().frame("packageListFrame");
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.linkText("Actions")).click();
		

	}

}
