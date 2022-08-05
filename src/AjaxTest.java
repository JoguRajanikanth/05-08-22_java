import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AjaxTest {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rajinikanth\\Downloads\\chromedriver.exe");
		WebDriver Ajax=new ChromeDriver();
		Ajax.get("https://www.demo.guru99.com/test/ajax.html");
		//Ajax.findElement(By.linkText("Selenium")).click();
		//Ajax.findElement(By.linkText("Ajax Demo")).click();
		Ajax.findElement(By.cssSelector("input[id='yes']")).click();
		Ajax.findElement(By.cssSelector("input[type='submit']")).click();
		Thread.sleep(10000);
		Ajax.findElement(By.xpath("//input[@type='reset']")).click();
		Thread.sleep(5000);
		Ajax.findElement(By.cssSelector("input[value='No']")).click();
		Ajax.findElement(By.cssSelector("input[type='submit']")).click();
		Ajax.findElement(By.xpath("//input[@type='reset']")).click();
		
	}

}
