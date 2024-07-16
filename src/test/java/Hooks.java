


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import common.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends BaseClass {
	
	//public static WebDriver driver;
	private BaseClass base;
	
	public Hooks(BaseClass base)
	{
		this.base=base;
	}
	@Before
	public void setUp() {
	  WebDriverManager.chromedriver().setup();
	  base.driver= new ChromeDriver();
	 
	}
	
	@After
	public void tearDown()
	{
		base.driver.quit();
	}
	
	
}
