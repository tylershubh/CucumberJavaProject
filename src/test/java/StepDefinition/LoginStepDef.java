package StepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import PagePom.Login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginStepDef {
	
	
	static WebDriver driver;
	Login login;
	
	@Given("Login to Flipkart")
	public void login_to_flipkart() throws InterruptedException {
		
		
		
	    // Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(5);
		System.out.println("Shubham");
		
		
	}

	@Then("Get the list of element from HomeAppliance")
	public void Get_the_list_of_element_from_HomeAppliance() {
	
		
	   WebElement home = driver.findElement(By.xpath("(//div[@class='YBLJE4'])[5]"));
	   home.getText();
	   home.click();
	   System.out.println(home.getText());
	   
	   
	}
	
	@When("Click on the dropdown")
	public void Click_on_the_dropdown() throws InterruptedException {
		
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(5000);
		   List<WebElement> homeList = driver.findElements(By.xpath("//*[@class='_3490ry']"));
		   
		   for(WebElement element : homeList) {
			   System.out.println("List All" + element.getText());
//			   Thread.sleep(2000);
//			   element.click();
//			   Thread.sleep(2000);
			   
		   }
		 
		   
		
	   
	   
	}
	
}
