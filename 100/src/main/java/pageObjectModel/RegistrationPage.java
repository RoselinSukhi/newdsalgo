package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {
	WebDriver driver;
	String s;

	By usrNmae=By.xpath("//input[@type='text']");
	By password=By.xpath("//input[@name='password1']");
	By rePassword=By.xpath("//input[@name='password2']");
	By regButt=By.xpath("//input[@type='submit']");
	By errPassMissMatch=By.xpath("//div[@class='alert alert-primary']");

	public RegistrationPage(WebDriver d) {
		driver=d;
	}

	public void usrNam() {
		driver.findElement(usrNmae).sendKeys("Roselin");
		driver.findElement(password).sendKeys("Rose1234");
		driver.findElement(rePassword).sendKeys("Rose@1234");
		driver.findElement(regButt).click();
		s=driver.findElement(errPassMissMatch).getText();
		System.out.println(s);
	}
}
