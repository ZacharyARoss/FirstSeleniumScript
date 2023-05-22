import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/opt/homebrew/bin/chromedriver");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		
		WebElement srch=driver.findElement(By.name("q"));
		
		srch.sendKeys("J.P. Morgan");
		
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		w.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//ul")));
		
		srch.submit();
		//driver.close();

	}

}
