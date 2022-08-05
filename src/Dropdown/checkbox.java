package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajinikanth\\Downloads\\chromedriver.exe");
		WebDriver dynamicdriver=new ChromeDriver();
		dynamicdriver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		dynamicdriver.manage().window().maximize();
		System.out.println(dynamicdriver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isSelected());

		dynamicdriver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click();
		dynamicdriver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isSelected();
		System.out.println(dynamicdriver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isSelected());
		
		//count the number of checkboxes
		
		dynamicdriver.findElements(By.xpath("//input[@type='checkbox']")).size();
		System.out.println(dynamicdriver.findElements(By.xpath("//input[@type='checkbox']")).size());

		

	}

}
