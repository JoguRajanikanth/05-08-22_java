package intro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorAuto {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","\\Users\\rajinikanth\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://sreeacademyecet.com/onlinetest/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("email")).sendKeys("rajanikanth");
		driver.findElement(By.name("password")).sendKeys("jogu123");
		driver.findElement(By.className("btn-success")).click();
		driver.findElement(By.linkText("Forgot Password")).click();
		

	}

}
