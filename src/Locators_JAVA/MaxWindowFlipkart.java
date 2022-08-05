package Locators_JAVA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaxWindowFlipkart {
	WebDriver driver=new ChromeDriver();
	static String url="https://www.flipkart.com/";
	static String userName="input[class='_2IX_2- VJZDxU']";
	static String password="//input[@class='_2IX_2- _3mctLh VJZDxU']";
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","\\Users\\rajinikanth\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//driver.navigate().wait(1000);
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.cssSelector(userName)).sendKeys("9959178821");
		driver.findElement(By.xpath(password)).sendKeys("143652");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		System.out.println(driver.getTitle());
//		//driver.navigate().to("https://www.facebook.com/");
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().back();
		//driver.findElement(By.cssSelector("span._2I9KP_._2WDRax")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Mobiles')]")).click();
		//System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Mobiles')]")).getText());
		//driver.findElement(By.xpath("//img[@alt='iPhone 12 Mini'][2]")).click();
//		//driver.findElement(By.xpath("//span[contains(text(),'Electronics')]")).click();
//		//driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div/div/p[3]/a[1]")).click();
//		driver.findElement(By.linkText("iPhone 13 Pro")).click();
//		driver.findElement(By.linkText("iPhone 13 Pro")).click();
//		driver.findElement(By.linkText("128 GB")).click();
		Thread.sleep(2000);
	    driver.findElement(By.linkText("iPhone 13 Pro")).click();
	   // driver.findElement(By.linkText("iPhone 13 Pro")).click();
	    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | link=iPhone 13 Pro | ]]
	    //driver.findElement(By.linkText("iPhone 13 Pro")).click();
	    driver.findElement(By.linkText("128 GB")).click();
	    //driver.findElement(By.cssSelector("button._2KpZ6l._1t_O3S._2ti6Tf._3AWRsL > span > span")).click();
	 

	}

}

