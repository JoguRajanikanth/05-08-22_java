package intro;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","\\Users\\rajinikanth\\Downloads\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://sso.teachable.com/secure/9521/identity/login");
		driver.findElement(By.id("email")).sendKeys("rajanikanthjogu@gmail.com");
		driver.findElement(By.name("password")).sendKeys("143652");
		driver.findElement(By.className("btn-primary")).click();
		
		System.out.println(driver.findElement(By.cssSelector("div.bodySmall")).getText());
		driver.findElement(By.cssSelector("a.bodySmall")).click();
		driver.findElement(By.linkText("Forgot Password")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("rajanikanth@gmai.com");
		driver.findElement(By.cssSelector("input[name='commit']")).click();
		//driver.findElement(By.className("Next")).click();
		
	}
}