package BaseModule1;
import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

//import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
    public static Properties prop;

		public static WebDriver initializeBrowser() throws IOException  {
			
			//Initializing chrome executable file location in my project
			
			String proPath="C:\\Users\\user\\eclipse-workspace\\100\\src\\main\\java\\data.property";
			FileInputStream fis=new FileInputStream(proPath);
			
		    prop=new Properties();
			prop.load(fis);
			String browserName=prop.getProperty("browser");
			
			if(browserName.equalsIgnoreCase("chrome")) {
				//System.setProperty("webdriver.chrome.driver","");
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
			}
			else if(browserName.equalsIgnoreCase("firefox")){
				driver=new FirefoxDriver();
				
			}
			else if(browserName.equalsIgnoreCase("IE")) {
				driver= new InternetExplorerDriver();
				
			}
		//	return null;
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			//driver.get("https://dsportalapp.herokuapp.com/");
			return driver;
		}
		
				
//public static void main(String args[]) throws IOException  {
	//initializeBrowser();

//}

}
