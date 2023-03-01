package Sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multiple {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		
		Thread.sleep(2000);
		
		//WebElement a=driver.findElement(By.xpath("//b[normalize-space()='Type:'] "));
		List<WebElement>r1=driver.findElements(By.tagName("font"));
		for (WebElement r2 : r1) {
		r2.click();
			System.out.println("click");
		}

			
		}
	//	r1.get(1).click();
		
	//	WebElement x=driver.findElement(By.xpath("//input[@value='oneway']"));
		
	//	x.click();	
		
		
	/*	WebElement y=driver.findElement(By.xpath("//select[@name='passCount']"));
		Select s= new Select(y);
		s.selectByIndex(3);
	}*/

}
