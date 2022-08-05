package Screen;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajinikanth\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		// driver.get("https://www.google.com/");

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// driver.manage().deleteCookieNamed("sessionKey");

		// click on any link
		// login page- verify login url

		driver.get("http://facebook.com");
		//Thread.sleep(3000);

		TakesScreenshot scrshot = ((TakesScreenshot)driver);
				scrshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrshot, new File ("Windowscreenshot.jpg"));

		// driver object is casting as a screenshot object by using the
		// "TakesScreenshot" method
		/*
		 * File src1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		 * FileUtils.copyFile(src1, new File("C:\\Users\\rajinikanth\\screenshot.png"));
		 * System.out.println(driver.getTitle());
		 */

	}

}
