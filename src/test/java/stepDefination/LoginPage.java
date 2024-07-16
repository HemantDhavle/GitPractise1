package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import common.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage extends BaseClass
{
	private BaseClass base;
	
	public LoginPage(BaseClass base)
	{
		this.base=base;
	}
String url="http://leaftaps.com/opentaps/control/main";
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
	  WebDriverManager.chromedriver().setup();
	  base.driver = new ChromeDriver();
	  base.driver.get(url);
	}
	
	@When("User enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String string, String string2) {
		base.driver.findElement(By.id("username")).sendKeys(string);
		base.driver.findElement(By.id("password")).sendKeys(string2);
	}
	
	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		base.driver.findElement(By.xpath("//*[@id='login']/p[3]/input")).click();
	}
	
	@Then("User should be able to login successfully")
	public void user_should_be_able_to_login_successfully() {
		String text = base.driver.findElement(By.xpath("//*[@id='label']/a")).getText();
		
		if(!text.contains("CRM"))
		{
			System.out.println("Login success!!!!!");
			
		}
	
		base.driver.quit();
	}
	
	@Then("User should not be able to login successfully")
	public void user_should_not_be_able_to_login_successfully() {
		String error = base.driver.findElement(By.xpath("//*[@id='errorDiv']/p[1]")).getText();
		 if (error.contains("Errors"))
			{
				System.out.println("Login fail!!!!!");
			}
		 base.driver.quit();
	}


}
