import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDemo 
{
	public static void main(String[] args) 
	{
		StartPage sp = new StartPage(new SafariDriver());
		sp.readMore();
		ArticlePage ap = sp.openSecondLink();
		ap.zeigeTitel();
		
		
	}
	
	private void test()
	{
		// Webdriver spezifisch für Browser instanziieren
				WebDriver driver = new FirefoxDriver();
				// Seite aufrufen
				driver.get("http://www.google.com");
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
	}
}