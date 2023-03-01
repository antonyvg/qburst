package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myntra {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(
				"https://www.myntra.com/?utm_source=dms_google&utm_medium=searchbrand_cpc&utm_campaign=dms_google_searchbrand_cpc_Search_Brand_Myntra_Brand_India_BM_TROAS_SOK&gclid=CjwKCAiAl9efBhAkEiwA4TorirSDgrliefkqkomEOBH9INrZdyCmIwB6HKUX70QM99vr7WAU2yUgDRoCcAMQAvD_BwE");
		Thread.sleep(1000);

		WebElement a = driver.findElement(By.xpath("//a[@class=\"desktop-main\" and text()='Men']"));

		Actions act1 = new Actions(driver);
		act1.moveToElement(a);
		act1.perform();

		WebElement b = driver.findElement(By.xpath("//a[@href=\"/men-briefs-and-trunks\"]"));

		Actions act2 = new Actions(driver);
		act2.doubleClick(b).perform();

	}

}
