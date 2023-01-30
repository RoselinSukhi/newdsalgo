package testPackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import BaseModule1.BaseClass;
import pageObjectModel.MainPage;
import pageObjectModel.RegistrationPage;
import pageObjectModel.signUp;

public class GetStarted extends BaseClass {
	WebDriver driver;
	
	
	//@BeforeTest
	@Test(priority=1)
	public void start() throws IOException {
	 System.out.println("Dropdown Check");
	 driver=initializeBrowser();
	 driver.manage().window().maximize();
	 driver.get(prop.getProperty("url"));
	 MainPage mp=new MainPage(driver);
	 mp.getStart();
	 //mp.dropDown(); mp.arry();
	 //mp.dropDown(); mp.grap();
	// mp.dropDown(); mp.linkLis();
	// mp.dropDown(); mp.que();
	// mp.dropDown(); mp.stak();
	// mp.dropDown(); mp.tre();	 
	// driver.close();
	 }
	
	@Test(priority=2)
	public void LogInCheckForValidUser() throws IOException {
		 System.out.println("Login Check");
		 driver=initializeBrowser();
		 driver.manage().window().maximize();
		 driver.get(prop.getProperty("url")); 
		 MainPage mp=new MainPage(driver);
		 mp.getStart();
		 signUp sp=new signUp(driver);
		 sp.sigIn();sp.logIn();
		 System.out.println("Please fill out the Field");
		 sp.userNam();sp.passWord();sp.logIn();sp.err1();
		 sp.sRegister();
		 sp.register();
		 System.out.println("Re-directed to the registration page");
		 sp.sigIn();sp.logIn();
		 sp.userNam1();sp.passWord1();sp.logIn();
		 System.out.println("Sucessfull Login");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.close();

	}
	
	@Test(priority=3)
	public void registeration() throws IOException {
		 System.out.println("Registration Check");
		 driver=initializeBrowser();
		 driver.manage().window().maximize();
		 driver.get(prop.getProperty("url")); 
		 MainPage mp=new MainPage(driver);
		 RegistrationPage rp=new RegistrationPage(driver);
		 signUp sp=new signUp(driver);
		 mp.getStart(); 
		 sp.register();
		 rp.usrNam();
		 sp.sigIn();
		 sp.userNam1();sp.passWord1();sp.logIn();
		 System.out.println("Login Sucessfull");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 driver.close();
	}
	@Test(priority=4)
	public void signout() throws IOException {
		 System.out.println("Signout Check");
		 driver=initializeBrowser();
		 driver.get(prop.getProperty("url")); 
		 MainPage mp=new MainPage(driver);
		 mp.getStart(); 
		 signUp sp=new signUp(driver);
		 sp.sigIn();
		 sp.userNam1();sp.passWord1();sp.logIn();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 sp.sinOut();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 driver.close();
	}
	}


