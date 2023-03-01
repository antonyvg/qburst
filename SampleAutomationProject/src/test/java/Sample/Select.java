package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Select {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		Thread.sleep(1000);

		WebElement x = driver.findElement(By.xpath("//select[@name='fromPort']"));

		org.openqa.selenium.support.ui.Select s = new org.openqa.selenium.support.ui.Select(x);
		s.selectByVisibleText("London");

		String s2 = driver.getTitle();
		System.out.println("title is " + s2);
		
		SoftAssert s1 = new SoftAssert();

		s1.assertEquals(" Mercury Tours", s1);
		System.out.println("true");

	}

}
