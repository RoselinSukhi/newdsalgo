package PagFactModel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class datStructure {
WebDriver driver;
public static Properties prop1;


public datStructure(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}


@FindBy(xpath="//a[text()='Get Started']") WebElement dataStructureOption;
@FindBy(xpath="//a[text()='Time Complexity']") WebElement TimeCmplex;
@FindBy(xpath="//a[text()='Try here>>>']") WebElement Try;
@FindBy(xpath="//a[text()='Practice Questions']")
public WebElement p;
@FindBy(xpath="//div[@class='CodeMirror-scroll']") WebElement data;

public static void fil() throws IOException {
String proPath1="C:\\Users\\user\\eclipse-workspace\\100\\src\\main\\java\\data1.property";
FileInputStream fis1=new FileInputStream(proPath1);
prop1=new Properties();
prop1.load(fis1);
}


public WebElement datStru() {
	return dataStructureOption;
}
public WebElement Timec() {
	return TimeCmplex;
}

public WebElement Tryy() {
	return Try;
}
public WebElement dataa() {
	return data;
}

}
