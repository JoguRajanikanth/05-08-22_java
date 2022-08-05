package Flipkart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	
	static String userName=("_2IX_2-");
	static String password=("input[type='password']");
	static String url=("https://www.flipkart.com/");
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","\\Users\\rajinikanth\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.className(userName)).sendKeys("9959178821");
		driver.findElement(By.cssSelector(password)).sendKeys("143652");
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Mobiles')]")).click();
		//driver.findElement(By.className("xtXmba")).click();
		driver.findElement(By.className("_1aqDWQ")).click();
		driver.findElement(By.cssSelector("div[class='_4rR01T']")).click();
		//driver.findElement(By.cssSelector("div[class='_2P_LDn']")).click();
		//driver.findElement(By.xpath("//div[text()='BUY NOW')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']")).click();
		driver.findElement(By.cssSelector("span[class='_3iRXzi']")).click();
		
		//driver.findElement(By.xpath("//button[@type='button']")).click();
		//driver.findElement(By.xpath("//div[@id='container']/div/div[3]/div/div[2]/div[3]")).click();
		//driver.findElement(By.cssSelector("span")).click();
		//driver.findElement(By.cssSelector("buton[class*='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		//driver.findElement(By.linkText("Cart")).click();
		//driver.findElement(By.cssSelector("button._2KpZ6l._2ObVJD._3AWRsL > span")).click();
		//driver.findElement(By.cssSelector("button._2KpZ6l.RLM7ES._3AWRsL")).click();
		
	}
	
}
