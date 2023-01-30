package testPackage;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import BaseModule1.BaseClass;
import PagFactModel.datStructure;
import pageObjectModel.MainPage;
import pageObjectModel.signUp;

public class TestDataStructure extends BaseClass {
WebDriver driver;

@Test(priority=6)
public void ds() throws IOException {
	
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver=initializeBrowser();
	 driver.manage().window().maximize();
	 driver.get(prop.getProperty("url"));
	 MainPage mp=new MainPage(driver);
	 mp.getStart();
	 signUp sp=new signUp(driver);
	 System.out.println("DataStructure");

	 sp.sigIn();
	 sp.userNam1();sp.passWord1();sp.logIn();
	datStructure s=new datStructure(driver);
	s.datStru().click();
	s.Timec().click();
	//s.p.click();

	s.Tryy().click();
	s.dataa().click();
}
}
