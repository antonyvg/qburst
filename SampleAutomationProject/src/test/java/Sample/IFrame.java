package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IFrame {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");

		WebElement a = driver.findElement(By.xpath("//input[@id='name']"));
		a.sendKeys("antony");

		driver.switchTo().frame(driver.findElement(By.id("frm1")));
				
		WebElement b = driver.findElement(By.id("course"));
		Select s1 = new Select(b);
		s1.selectByIndex(3);
		
		driver.switchTo().defaultContent();
		
		a.clear();
		a.sendKeys("georegr");

	}

}
