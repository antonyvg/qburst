package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bethelhm {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.bethlehemmatrimonial.com/");
		Thread.sleep(2000);

		String x = driver.getTitle();
		System.out.println("title is " + x);

		// Assert.assertEquals("bethlm", x);

		SoftAssert s = new SoftAssert();
		s.assertEquals("bethlm", x);
		System.out.println("false");

		WebElement a = driver.findElement(By.xpath("//select[@name='g']"));
		// Select s1= new Select();
		Select s1 = new Select(a);
		s1.selectByIndex(1);
		Thread.sleep(1000);

		WebElement b = driver.findElement(By.xpath("//select[@name='af']"));
		Select s2 = new Select(b);
		s2.selectByVisibleText("25");

		WebElement c = driver.findElement(By.xpath("//select[@name='wp']"));
		Select s3 = new Select(c);
		s3.selectByIndex(4);

		WebElement d = driver.findElement(By.xpath("//label[normalize-space()='Profiles with photo']"));
		Actions a1 = new Actions(driver);
		a1.click(d).perform();

		WebElement e = driver.findElement(By.xpath("//input[@value='SEARCH']"));
		Actions a2 = new Actions(driver);
		a2.click(e).perform();

	}

}
