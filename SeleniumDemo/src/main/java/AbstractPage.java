import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class AbstractPage {
	protected WebDriver driver;
	protected String url = "https://blogs.apache.org/";
	
	public AbstractPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void open(String url)
	{
		driver.get(url);
	}

}
