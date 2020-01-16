import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighlightDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//admin//Desktop//chromedriver.exe");
		WebDriver objDriver = new ChromeDriver();
		objDriver.get("http://demo.opencart.com/");
		WebElement username = objDriver.findElement(By.name("search"));
		highlightElement(objDriver,username);
	}
	public static void highlightElement(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('style',"+"'background:yellow;border:2px solid red;');",element);
	try
	{
		Thread.sleep(1000);
	}
	catch(InterruptedException e) {
		System.out.println(e.getMessage());
	}
	js.executeScript("arguments[0].setAttribute"+"('style','border:solid 2px white');",element);
	}
}
