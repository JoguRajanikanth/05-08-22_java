package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajinikanth\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		//checkbox1 selecting and verifying
		driver.findElement(By.id("checkBoxOption1")).click();
		driver.findElement(By.id("checkBoxOption1")).isSelected();		
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		
		driver.findElement(By.id("checkBoxOption1")).click();
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		
		//count the number of checkboxes
		
		//driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		Thread.sleep(5000);
		
		//driver.findElement(By.xpath("input[value='radio2'][2]")).click();
		
		System.out.println(driver.findElements(By.xpath("//input[@type='radio']")).size());
		driver.close();
		
		
		
		
		

	}

}
