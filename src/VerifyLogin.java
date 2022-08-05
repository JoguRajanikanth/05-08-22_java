import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.AssertJUnit;
import org.testng.asserts.Assertion;
import net.jodah.failsafe.internal.util.Assert;
public class VerifyLogin {
	WebDriver driverGuru=new FirefoxDriver();
	static String url="https://www.demo.guru99.com/V4/";
	static String name="input[name='uid']";
	static String password="//input[@name='password']";
	static String button="//input[@value='LOGIN']";
	
	public static void main(String[] args) throws InterruptedException {
			invoke();
		
		//System.setProperty("webdriver.gecko.driver","\\Users\\rajinikanth\\Downloads\\geckodriver.exe");
		//WebDriver driverGuru=new FirefoxDriver();
		
		}
	public static void invoke() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","\\Users\\rajinikanth\\Downloads\\geckodriver.exe");
		WebDriver driverGuru=new FirefoxDriver();
		driverGuru.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driverGuru.get(url);
		driverGuru.findElement(By.cssSelector(name)).sendKeys("mngr384716");
		driverGuru.findElement(By.xpath(password)).sendKeys("eguvYte");
		driverGuru.findElement(By.xpath(button)).click();
		Thread.sleep(5000);
		System.out.println(driverGuru.findElement(By.xpath("//marquee[@class='heading3']")).getText());
		//Assert.Equals(driverGuru.findElement(By.xpath("//marquee[@class='heading3']")).getText(), "Welcome To Manager's Page of Guru99 Bank");
		AssertJUnit.assertEquals(driverGuru.findElement(By.xpath("//marquee[@class='heading3']")).getText(), "Welcome To Manager's Page of Guru99 Bank");
		//AssertJUnit.assertEquals(driverGuru.findElement(By.xpath("//marquee[@class='heading3']")).getText(), "Welcome To Manager's Page of Guru99 Bank", args, driverGuru);
		System.out.println(driverGuru.getTitle());
	}
	
}
