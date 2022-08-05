package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoSug {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajinikanth\\Downloads\\chromedriver.exe");
		WebDriver autodriver=new ChromeDriver();
		autodriver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		autodriver.manage().window().maximize();
		autodriver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(5000);
		List<WebElement> options=autodriver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for(WebElement option :options) 
		{
		
			if(option.getText().equalsIgnoreCase("india"))
			{
				System.out.println(option.getText().equalsIgnoreCase("india"));
				option.click();
				break;
			
				
			}
			
		
		}
	

	}

}
