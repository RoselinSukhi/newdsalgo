package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class MainPage {
	WebDriver driver;
	String s;
	
	By getStarted=By.xpath("//button[text()='Get Started']");
	By dataDropdown = By.xpath("//a[@href='#']");
	By array=By.xpath("//a[text()='Arrays']");
    By linkList=By.xpath("//a[text()='Linked List']");
    By stack=By.xpath("//a[text()='Stack']");
    By queue=By.xpath("//a[text()='Queue']");
    By tree=By.xpath("//a[text()='Tree']");
    By graph=By.xpath("//a[text()='Graph']");
    By error1=By.xpath("//div[@class='alert alert-primary']");
    
    
	public MainPage(WebDriver d) {
		driver=d;
	}
	
	public void getStart() {
		driver.findElement(getStarted).click();	
	}
	
	public void dropDown() {
		driver.findElement(dataDropdown).click();	
	}
	
	public void arry() {
		driver.findElement(array).click();
		s=driver.findElement(error1).getText();
		System.out.println(s);
	}
	
	public void linkLis() {
		driver.findElement(linkList).click();
		s=driver.findElement(error1).getText();
		System.out.println(s);
	}
	
	public void stak() {
		driver.findElement(stack).click();
		s=driver.findElement(error1).getText();
		System.out.println(s);
	}
	
	public void que() {
		driver.findElement(queue).click();
		s=driver.findElement(error1).getText();
		System.out.println(s);
	}

	public void tre() {
		driver.findElement(tree).click();
		String s=driver.findElement(error1).getText();
		System.out.println(s);
	}
	
	public void grap() {
		driver.findElement(graph).click();
		String s=driver.findElement(error1).getText();
		System.out.println(s);
	}
}
