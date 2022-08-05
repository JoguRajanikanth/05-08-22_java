package intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class seleintro {

	//@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver","\\Users\\rajinikanth\\Downloads\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
//		System.setProperty("webdriver.chrome.driver","\\Users\\rajinikanth\\Downloads\\chromedriver.exe");
//		WebDriver driver1 =new ChromeDriver();
//		System.setProperty("webdriver.gecko.driver","\\Users\\rajinikanth\\Downloads\\geckodriver.exe");
//		WebDriver driver2 =new FirefoxDriver();
		driver.get("https://google.com");
		driver.getTitle();
		
		System.out.println(driver.getPageSource());
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
		//driver.quit();
		
		}
	
}
 