import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class StartPage extends AbstractPage {


	public StartPage(WebDriver driver) 
	{
		super(driver);
		/*
		// Element per Namen finden
		WebElement element = driver.findElement(By.name("q"));
		// Eingabe
		element.sendKeys("Cheese!");
		// Form wird automatisch gefunden und los geschickt
		element.submit();
		// Titel der Page prüfen
		System.out.println("Page title is: " + driver.getTitle());
		// Google’s suche ist asynchron / bzw. Wird asynchron gerendered, warten
		(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver d) {
				return d.getTitle().toLowerCase().startsWith("cheese!");
			}
		});
		// titel ausgeben
		System.out.println("Page title is: " + driver.getTitle());
		*/
	}
	
	public void readMore()
	{
		WebElement element = driver.findElement(By.linkText("Read more..."));
		String target = element.getAttribute("href");
		System.out.println("Ziel des Links: "+target);
	}

	
	public ArticlePage openSecondLink()
	{
		List<WebElement> elements = driver.findElements(By.linkText("Read more..."));

		String target = elements.get(1).getAttribute("href");
		System.out.println("Ziel des zweiten Links: "+target);
	
		driver.get(target);
		return new ArticlePage(driver);
		
	}
	
}
