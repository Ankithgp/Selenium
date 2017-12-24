package turnerLatam;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.security.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {

	WebDriver driver;

	@BeforeTest
	public void browserInitiatize() {
		System.setProperty("webdriver.chrome.driver", "F:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@Test
	public void editWO() {

		WebDriverWait wait = new WebDriverWait(driver, 15);
		driver.get("https://turnertrackerqa.clearhub.tv/BC/Product/Modules/SignIn.aspx");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Actions act= new Actions (driver);
		driver.findElement(By.xpath("//input[@name='x-login-id']")).sendKeys("media_manager", Keys.ENTER);
		// driver.findElement(By.xpath("//input[@id='loginContinue']")).click();
		driver.findElement(By.xpath("//input[@type='password'][@id='x-pwd']")).sendKeys("Tracker@123", Keys.ENTER);
		// driver.findElement(By.xpath("//input[@id='loginSubmit']")).click();
		driver.manage().window().maximize();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("globalWaiting")));
		// Navigate to Longform dashboard
		driver.findElement(By.xpath("//*[@title='LongForm']//*[text()='LongForm']")).click();
		new WebDriverWait(driver, 15).until(ExpectedConditions.invisibilityOfElementLocated(By.id("globalWaiting")));
		// Click on search icon on Longform dashboard
		driver.findElement(By.xpath("//*[@id='WCsrchIcon']")).click();
		// Serach for the particular element
		// \"DOABARBARADOABARBARA--20171123193107180--539--WO--6000\"
		driver.findElement(By.xpath("//*[@class='srchControl style-scope pft-searchbox']")).sendKeys("2125825-133",Keys.ENTER);
		new WebDriverWait(driver, 15).until(ExpectedConditions.invisibilityOfElementLocated(By.id("globalWaiting")));
		driver.findElement(By.xpath("//tr/td//*/div[@title='Edit Workorder']")).click();
		new WebDriverWait(driver, 15).until(ExpectedConditions.invisibilityOfElementLocated(By.id("globalWaiting")));
		driver.findElement(By.xpath("//table[@class='htCore']//tbody//tr[1]/th/following-sibling::td[8]")).click();
		driver.findElement(By.xpath("//*[@id='LinkedFormPopUp_303']//div[@class='wtSpreader']//tr[1]//td[2]")).click();
		// WebElement ele =
		// driver.findElement(By.xpath("//div[@id='LinkedFormPopUp_304']//div[@id='formAttributesOuterDiv']//div[@class='wtHider']//table[@class='htCore']//tbody/tr[1]/th[1]//following-sibling::td[1]"));
		// driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.xpath("//tr[1]/td[@spreadsheetpropertyname='S_SEG_NU']"));
		// boolean tr=ele.isDisplayed();
		ele.click();
		ele.click();
		// Actions action=new Actions(driver);
		// action.moveToElement(ele).doubleClick();
		// System.out.println(tr);
		driver.findElement(By.xpath("//textarea[@class='handsontableInput']")).sendKeys("1");
		WebElement path = driver.findElement(By.xpath("//tr[1]//td[@spreadsheetpropertyname='S_ORIG_FI']"));// .sendKeys("O:\\clear_test\\SD_SCENARIO_02.mov");
		// boolean a =path.isDisplayed();
		// System.out.println(a);
		
//		path.click();
		/*JavascriptExecutor exe = (JavascriptExecutor) driver;
		exe.executeScript("var ele = arguments[0];ele.innerHTML = " + "'O:\\\\clear_test\\\\SD_SCENARIO_02.mov" + "'",
				path);*/
		
		String myString = "O:\\\\clear_test\\\\SD_SCENARIO_02.mov";
		StringSelection stringSelection = new StringSelection(myString);
		Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
		clpbrd.setContents(stringSelection, null);
		Transferable t = clpbrd.getContents(null);
		try {
			System.out.println((String) t.getTransferData(DataFlavor.stringFlavor));
		} catch (UnsupportedFlavorException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
//		new Actions(driver).sendKeys(path, "O:\\\\clear_test\\\\SD_SCENARIO_02.mov").build().perform();
		new Actions(driver).sendKeys(path, Keys.CONTROL+""+Keys.chord("v")).build().perform();
		//path.sendKeys("O:\\clear_test\\SD_SCENARIO_02.mov");
		
		driver.findElement(By.xpath("//div[@id='Save3']")).click();
		WebElement sv2=driver.findElement(By.xpath("//div[@id='Save2']"));
		//new WebDriverWait(driver, 15)
		driver.findElement(By.xpath("//div[@id='SaveWorkorder']"));
		

	}

	// @After
	// public void closeBrowser()
	// {
	//
	// driver.quit();
	// }

}
