import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","\\Users\\rajinikanth\\Downloads\\geckodriver.exe");
		WebDriver Radio=new FirefoxDriver();
		Radio.get("https://www.demo.guru99.com/test/radio.html");
		Radio.findElement(By.cssSelector("input[value='Option 1']")).click();
		Radio.findElement(By.cssSelector("input[value='Option 2']")).click();
		Radio.findElement(By.cssSelector("input[value='Option 3']")).click();
		Radio.findElement(By.xpath("//input[@value='checkbox1']")).click();
	

	}

}
