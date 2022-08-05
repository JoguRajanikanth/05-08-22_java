import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Guru99Login {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","\\Users\\rajinikanth\\Downloads\\geckodriver.exe");
		WebDriver driverGuru=new FirefoxDriver();
		driverGuru.get("https://www.demo.guru99.com/test/login.html");
		driverGuru.findElement(By.cssSelector("input[id='email']")).sendKeys("mngr384716");
		driverGuru.findElement(By.xpath("//input[@data-validate='isPasswd']")).sendKeys("eguvYte");
		driverGuru.findElement(By.xpath("//button[@name='SubmitLogin']")).click();

	}

}
