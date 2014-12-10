import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ArticlePage extends AbstractPage
{

	public ArticlePage(WebDriver driver) 
	{
		super(driver);
		this.driver = driver;
	}

	public void zeigeTitel()
	{
		System.out.println("Title der Read more Seite: "+driver.getTitle());
	}
	
	public void suche()
	{
		String q = "qwsdfgbhnm";
		// Element per Namen finden
		WebElement element = driver.findElement(By.id("q"));
		// Eingabe
		element.sendKeys(q);
		element.submit();
	}

}
