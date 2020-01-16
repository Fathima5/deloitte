import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertOne {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//admin//Desktop//chromedriver.exe");
		WebDriver objDriver = new ChromeDriver();
		objDriver.get("https://ksrtc.in/oprs-web/ticket/waitlist.do");
		objDriver.manage().window().maximize();
		//objDriver.findElement(By.xpath("//*[@id=\"searchBtn\"]")).click();
		//objDriver.switchTo().alert().accept();
		
		objDriver.findElement(By.xpath("/html/body/main/section/div/div/div/div/form/ul/li[3]/a")).click();
		objDriver.findElement(By.xpath("//*[@id=\"searchBtn\"]")).click();
		System.out.println(objDriver.switchTo().alert().getText());
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
			
		}
		objDriver.quit();
		
	}

}
