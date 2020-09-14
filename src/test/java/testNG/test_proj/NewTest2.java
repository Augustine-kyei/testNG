
package testNG.test_proj;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest2 {
	
	
	//WebDriver driver;

	
	  @BeforeMethod
	  public void beforeMethod() {
		  
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\austi\\Desktop\\DevOps\\Selenium Folder\\Selenium 3.4\\Drivers\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
		 String appUrl = "http://3.21.103.115:32768";
		 driver.get(appUrl);
		 
		//String appUrl = "http://3.137.149.135:32768";
			//driver.get(appUrl);
			
			//String expectedTitle = "Simple PHP Website";
			//String actualTitle = driver.getTitle();
			
			String homepageURL = driver.getCurrentUrl();
			System.out.println("I am in Home page");
			System.out.println(homepageURL);

			
			driver.navigate().to("http://3.21.103.115:32768/about-us.php");
			String currentURL = driver.getCurrentUrl();
			System.out.println("I am in About Us page ");
			System.out.println(currentURL);
				
	  }
	
  @Test
  public void f() {
	  System.out.println("test is ok");
	
  }



  @AfterTest
  public void afterTest() {
	  
	 // driver.close();
  }

}
