package test;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;

import base.ReadWrite_Properties;

public class BaseTest {
	public WebDriver driver;
	
	@BeforeClass
	public void start() throws IOException  {
		
			Properties properties =new ReadWrite_Properties().readPropertiesFile(System.getProperty("user.dir")+"/src/main/java/base/Config/config.properties");
					
			
			String  browser=properties.getProperty("browser");
			
			if (browser.equalsIgnoreCase("chrome")) {
				System.out.println("Chrome");
				System.setProperty("webdriver.chrome.driver","/Users/biplobroy/Documents/GitRepo/qaautomation/175Mott_F/ChromDriver/chromedriver");
				//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/ChromDriver/chromedriver");

						driver=new ChromeDriver();
			}
			
			else if(browser.equalsIgnoreCase("Firefox")){
				System.out.println("Firefox ");
				System.setProperty("", "");
				driver= new FirefoxDriver();
			}
			
			else if (browser.equalsIgnoreCase("IE")) {
				
				System.out.println("Internet Explorer");
				System.setProperty("", "");
				driver= new InternetExplorerDriver();
			}
			else {
				System.out.println("No Browser");
			}
			
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.MINUTES);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.get("https://kamoleshbachar.wixsite.com/website");
			
			
			
			
		}
	}		


