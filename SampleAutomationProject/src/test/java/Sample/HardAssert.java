package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HardAssert {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		String a=driver.getTitle();
		System.out.println("the titile is "+a);
		Thread.sleep(1000);
		
		Assert.assertEquals(a, "Google");
		System.out.println("pass");
		
		Assert.assertNotNull(driver);
		System.out.println("pass2");
		
		WebElement b=driver.findElement(By.xpath("//input[@class='gLFyf']"));
		b.click();
		b.sendKeys("antony");
		b.click();
		Thread.sleep(3000);
		
		//driver.navigate().to("https://www.mathrubhumi.com/");
		
		driver.quit();
			}

}
