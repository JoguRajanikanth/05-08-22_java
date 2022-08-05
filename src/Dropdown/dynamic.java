package Dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamic {


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajinikanth\\Downloads\\chromedriver.exe");
		WebDriver dynamicdriver=new ChromeDriver();
		dynamicdriver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		dynamicdriver.manage().window().maximize();
		dynamicdriver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		dynamicdriver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']  //a[@value='HYD']")).click();
		//dynamicdriver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']  //a[@value='HYD']")).isSelected();
		dynamicdriver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		//System.out.println(dynamicdriver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']  //a[@value='HYD']")).isSelected());
		dynamicdriver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		dynamicdriver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='AMD']")).click();
		dynamicdriver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		dynamicdriver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click();
		
		
		
		}

}
