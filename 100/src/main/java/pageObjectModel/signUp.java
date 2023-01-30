package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class signUp {
      WebDriver driver;
      String s;
      
      By signin=By.xpath("//a[text()='Sign in']");
      By register=By.xpath("//a[text()=' Register ']");
      By username=By.xpath("//input[@name='username']");
      By pass=By.xpath("//input[@name='password']");
      By logn=By.xpath("//input[@value='Login']");
      By smalReg=By.xpath("//a[text()='Register!']");
      By Reg=By.xpath("//a[text()=' Register ']");
      By error1=By.xpath("//div[@class='alert alert-primary']");
      By signOut=By.xpath("//a[text()='Sign out']");
      
      public signUp(WebDriver d) {
  		driver=d;
  	}
      
      public void sinOut() {
  		driver.findElement(signOut).click();	
  		
  	}

      public void err1() {
    		s=driver.findElement(error1).getText();	
    		System.out.println(s);
    	}
      
      
      public void sRegister() {
    		driver.findElement(smalReg).click();	
    	}
      
      public void logIn() {
    		driver.findElement(logn).click();	
    	}
      
      public void passWord() {
  		driver.findElement(pass).sendKeys("1@Roselin");;	
  	}
      public void passWord1() {
    		driver.findElement(pass).sendKeys("Rose@1234");;	
    	}

      public void userNam() {
    		driver.findElement(username).sendKeys("Rose");;	
    	}
      public void userNam1() {
  		driver.findElement(username).sendKeys("Ninjagos");;	
  	}

      
      public void register() {
  		driver.findElement(register).click();	
  	}
      
      public void sigIn() {
  		driver.findElement(signin).click();	
  	}
}
