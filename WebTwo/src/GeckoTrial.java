import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GeckoTrial {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C://Users//admin//Desktop//geckodriver.exe");
		WebDriver objDriver = new FirefoxDriver();
		objDriver.get("http://demo.opencart.com");
	}

}
