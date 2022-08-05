

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class httpsSSLCerts {

	public static void main(String[] args) {
		
		
		ChromeOptions  options = new ChromeOptions();
		options.setAcceptInsecureCerts(true); //here Chromeoptions is class ,options is object, with hejp of object accessing the class methods
		//here options as object,this object behavior will pass as argument in browser invoking , based on the args browser knows the object behavior and it follows the methods/propertis
		//options.addExtensions("path"); // to Add extensions to automated browser
		
		//  to Set the Proxy Browser 
		
		/*
		 * Proxy proxy= new Proxy();
		 *  proxy.setHttpProxy("IP Address: 000011");
		 * options.setCapability("proxy", proxy);
		 * 
		 * "proxy"-->Capabillity name
		 * proxy --->Actual proxy value (ip address)
		 */
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rajinikanth\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
		driver.getTitle();
		System.out.println(driver.getTitle());
	}

}
