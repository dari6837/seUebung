import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.PageFactory;


public class TestSelenium {

	StartPage sp;
	WebDriver driver;
	
	public TestSelenium() 
	{

	}
	
	@Before
	public void init()
	{
		this.driver = new FirefoxDriver();
		System.out.println("driver()");
	}
	
	@Test
	public void startPageTest()
	{
		System.out.println("startPageTest()");
		StartPage sp = PageFactory.initElements(this.driver, StartPage.class);
		sp.open("https://blogs.apache.org/");
	}

}
