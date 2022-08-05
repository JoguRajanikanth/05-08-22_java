package GURU99PROJECT;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MOBILEMENU {
	static String url="http://live.techpanda.org/index.php/";
	public static int scc=0;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","\\Users\\rajinikanth\\Downloads\\geckodriver.exe");
		WebDriver GuruMobile=new FirefoxDriver();
		GuruMobile.get(url);
		GuruMobile.manage().window().maximize();
		GuruMobile.getTitle();
		System.out.println(GuruMobile.getTitle());
		GuruMobile.findElement(By.linkText("MOBILE")).click();
		System.out.println(GuruMobile.getTitle());
		//GuruMobile.findElement(By.cssSelector("(//select[@title='Sort By'])[1]")).click();
		WebElement staticDropdown=GuruMobile.findElement(By.xpath("(//select[@title='Sort By'])[1]"));
		Select dropdown=new Select(staticDropdown);
		///
		//dropdown.selectByVisibleText("Price");
		dropdown.selectByIndex(1);
		System.out.println(GuruMobile.getTitle());
		 
		//dropdown.getFirstSelectedOption().getText();
		//System.out.println(dropdown.getFirstSelectedOption().getText());
		scc = (scc+1);
		System.out.println(scc);
		String demoSite  = GuruMobile.findElement(By.cssSelector("h2")).getText();
	    System.out.println(demoSite);
	    
	 /*   try {
	      AssertJUnit.assertEquals("THIS IS DEMO SITE FOR   ", demoSite);
	    } 
	    catch (Error e) {
	      verificationErrors.append(e.toString());
	    }*/
	    
	    GuruMobile.findElement(By.linkText("MOBILE")).click();
		File scrFile = ((TakesScreenshot)GuruMobile).getScreenshotAs(OutputType.FILE);
		//System.out.println(File scrFile);
		String png = ("C:\\Users\\rajinikanth\\OneDrive\\Desktop\\LiveProject_Guru\\project2" + scc + ".png");
		//System.out.println(String png);
		FileUtils.copyFile(scrFile, new File(png));
//		dropdown.selectByIndex(0);
//		System.out.println(dropdown.getFirstSelectedOption().getText());
//		//Thread.sleep(2000);
//		dropdown.selectByVisibleText("Price");//dropdown.selectByIndex(2);
//		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		
		
		
		
		
		

	}

}
