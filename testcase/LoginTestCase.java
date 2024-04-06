package testcase;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import base.BasePage;
import page.HomePage;
import page.LoginPage;

public class LoginTestCase {
	WebDriver dv;

  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	  dv = new ChromeDriver();
	  BasePage bp = new BasePage(dv);
	  bp.startbrowser("https://demoblaze.com");
  }
	
  @Test
  public void test_login() {
	  
	  try {
	  HomePage hp = new HomePage(dv);
	  hp.click_nav_login();
	  
	  LoginPage lp = new LoginPage(dv);
	  lp.login("testmorning", "test123");
	  Thread.sleep(10000);
		
	  String value = "Welcome testmorning";
	  String result = dv.findElement(By.id("nameofuser")).getText();
	  Assert.assertEquals(result, value,"This value doesnot match");
	  Thread.sleep(5000);
	  }
	  catch (Exception E) {
		  System.out.print(E);
	  }
  
  
  }
  

  @AfterTest
  public void afterTest() {
  
	  dv.quit();
  
  }

}
