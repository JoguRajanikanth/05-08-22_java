package Screen;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gurusreenshot {

	public static void main(String[] args) {
		
		//WebDriver driver ;
    	//System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
    	//driver = new FirefoxDriver();
    	
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\rajinikanth\\Downloads\\chromedriver.exe"); WebDriver driver1 =
		 * new ChromeDriver();
		 */
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\rajinikanth\\Downloads\\geckodriver.exe");
		WebDriver driver1 = new FirefoxDriver();

        //goto url

        driver1.get("http://demo.guru99.com/V4/");

        //Call take screenshot function

      //  this.takeSnapShot(driver1, "C:\\Users\\rajinikanth\\screenshot.jpg");

    

    

    //public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)driver1);

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                File DestFile=new File("C:\\Users\\rajinikanth\\rakanoscreenshot.jpg");

                //Copy file at destination

                FileUtils.copyFile(SrcFile, DestFile);
	}

}
