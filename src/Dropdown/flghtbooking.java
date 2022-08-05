package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class flghtbooking {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajinikanth\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
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

	}

}
