package Sample;

import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class SoftAssert {
	
	WebDriver driver;
  @Test
  public void f() {
	  
	  String a=driver.getTitle();
	  System.out.println("titile is "+a);
	  
	 Assert.assertEquals(a, "Google");
	 System.out.println("pass");
	  
	 SoftAssert s= new SoftAssert();
	 
	  
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  
	  
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com/");
	  Thread.sleep(2000);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
