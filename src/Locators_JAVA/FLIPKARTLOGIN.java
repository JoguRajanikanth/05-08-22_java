package Locators_JAVA;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FLIPKARTLOGIN {

	public static void main(String[] args) throws InterruptedException {
	
	
		//NAUKARI EnE
		System.setProperty("webdriver.chrome.driver","\\Users\\rajinikanth\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/nlogin/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		//driver.findElement(By.className("IiD88i _351hSN undefined")).sendKeys("9959178821");
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("rajanikanthjogu@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("14016t1638L");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("div[class='crossIcon chatBot chatBot-ic-cross']")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/span/div/div/div/div[2]/div/div[2]/div[1]/div/div[1]/div[2]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/span/div/div/div/div/div/div[2]/div[2]/div/div/ul/li[3]/a")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().sendKeys("qualityEngineer");
		driver.switchTo().alert().getText();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
	}
	

}
