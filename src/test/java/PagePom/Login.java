package PagePom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	
	WebDriver driver;
	
	By home_link = By.xpath("(//div[@class='YBLJE4'])[5]");
	By home_list = By.xpath("//*[@class='_3490ry']");
	

public Login(WebDriver driver) {
	
	this.driver = driver;
	
}


public void clickhome () {
	
	driver.findElement(home_link).click();
	driver.findElement(home_link).getText();
	
	
}







}