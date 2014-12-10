import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestSelenium {

	StartPage sp;
	WebDriver driver;
	
	public TestSelenium() 
	{

	}
	
	@Before
	public void init()
	{
	//	System.out.println("terstsdlöjfnsdlk");
		//new FirefoxDriver().get("https://blogs.apache.org/");
		//System.out.println("driver()");
	}
	
	@Test
	public void startPageTest()
	{
		System.out.println("vorTest");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://blogs.apache.org/");
		assertEquals("Titel pruefen", "blogs", driver.getTitle().substring(0, 5));
		System.out.println("startPageTest()");
		//StartPage sp = PageFactory.initElements(this.driver, StartPage.class);
		//this.driver.get("https://blogs.apache.org/");
	}

}
