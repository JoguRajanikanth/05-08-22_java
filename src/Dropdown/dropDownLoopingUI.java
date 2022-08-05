package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropDownLoopingUI {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajinikanth\\Downloads\\chromedriver.exe");
		WebDriver dropdowndriver=new ChromeDriver();
		dropdowndriver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		dropdowndriver.manage().window().maximize();
		
		dropdowndriver.findElement(By.id("divpaxinfo")).click();
		System.out.println(dropdowndriver.findElement(By.id("divpaxinfo")).getText());
		Thread.sleep(5000);
		dropdowndriver.findElement(By.id("hrefIncAdt")).click();
		Thread.sleep(5000);
		System.out.println(dropdowndriver.findElement(By.id("divpaxinfo")).getText());
		
		for(int i=1;i<5;i++) {
			
			dropdowndriver.findElement(By.id("hrefIncAdt")).click();
			
		}
		System.out.println(dropdowndriver.findElement(By.id("divpaxinfo")).getText());
		dropdowndriver.findElement(By.id("btnclosepaxoption")).click();
		
		

	}

}
