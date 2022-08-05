package Dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class e2e {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajinikanth\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']  //a[@value='HYD']"))
				.click();
		// dynamicdriver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']
		// //a[@value='HYD']")).isSelected();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		// System.out.println(dynamicdriver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']
		// //a[@value='HYD']")).isSelected());
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='AMD']"))
				.click();
		//driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		// calender selecting date
		
		// driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active']")).click();
		//driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight']")).click();
		System.out.println(driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight']")).getText());
		Thread.sleep(2000);
		// select passanger

		driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click();

		driver.findElement(By.id("divpaxinfo")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Thread.sleep(5000);
		driver.findElement(By.id("hrefIncAdt")).click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		for (int i = 1; i < 5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();

		}
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.findElement(By.id("btnclosepaxoption")).click();

		// driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
		// System.out.println(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).getText());
		// driver.findElement(By.xpath("")).click();

		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropDown = new Select(staticDropdown);
		System.out.println(dropDown.getFirstSelectedOption().getText());
		dropDown.selectByIndex(2);
		Thread.sleep(5000);
		System.out.println(dropDown.getFirstSelectedOption().getText());
		dropDown.selectByValue("USD");
		Thread.sleep(5000);
		System.out.println(dropDown.getFirstSelectedOption().getText());
		dropDown.selectByVisibleText("INR");
		Thread.sleep(5000);
		System.out.println(dropDown.getFirstSelectedOption().getText());

		// press search
		driver.findElement(By.xpath("//input[@name='ctl00$mainContent$btn_FindFlights']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);//never use implicity inside the class/method.implicity should be declare at globally

	}

}
