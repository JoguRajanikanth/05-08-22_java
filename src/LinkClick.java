import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkClick {
	public static void main(String []args) {
		System.setProperty("webdriver.gecko.driver","\\Users\\rajinikanth\\Downloads\\geckodriver.exe");
		WebDriver Link=new FirefoxDriver();
		Link.get("https://www.demo.guru99.com/test/link.html");
		Link.findElement(By.cssSelector("a[href='http://www.google.com']")).click();
		Link.get("https://www.demo.guru99.com/test/link.html");
		Link.findElement(By.xpath("//a[contains(text(),'click')][2]")).click();
	}

}
