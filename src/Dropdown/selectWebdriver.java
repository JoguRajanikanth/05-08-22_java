package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectWebdriver {

	static String url="https://rahulshettyacademy.com/seleniumPractise/#/";

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rajinikanth\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.getTitle();
		System.out.println(driver.getTitle());
		driver.findElement(By.className("product-name")).click();
		Thread.sleep(2000);
		for(int i=1;i<6;i++) {
			driver.findElement(By.className("increment")).click();
		}
		
		//driver.findElement(By.xpath("//input[@value='5'][1]")).getText();
		//System.out.println(driver.findElement(By.xpath("//input[@value='5'][1]")).getText());
		//System.out.println(driver.findElement(By.cssSelector("input[value='5']")).getText());
		driver.findElement(By.className("quantity")).click();
		System.out.println(driver.findElement(By.className("quantity")).getText());
		//driver.findElement(By.cssSelector("input[value='5']")).click();
		System.out.println(driver.findElement(By.xpath("//h4[contains(text(),'Brocolli - 1 Kg')][1]")).getText());
		driver.findElement(By.xpath("//div[@class='products']//div[1]//div[3]")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='products']//div[1]//div[3]")).getText());
		System.out.println(driver.findElement(By.xpath("//div[@class='products']//div[1]//div[2]//input[1]")).getText());
		driver.findElement(By.xpath("//div[@class='cart-info']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='cart-info']")).getText());
		driver.findElement(By.xpath("//a[@class='cart-icon']")).click();
		driver.findElement(By.xpath("//button[@type='button'][contains(text(),'PROCEED TO CHECKOUT')]")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
		WebElement Dropdown=driver.findElement(By.xpath("//select[@style='width: 200px;']"));
		Select dropdown=new Select(Dropdown);
		//dropdown.selectByIndex(10);/selct by using the index value .
		dropdown.selectByValue("India");
		//driver.getTitle();
		//System.out.print(dropdown.selectByValue("India")).getText();
		driver.findElement(By.xpath("//input[@class='chkAgree']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Proceed')][1]")).click();
		driver.getTitle();
		driver.getClass();

	}

}

