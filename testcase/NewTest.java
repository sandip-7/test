package testcase;

import org.testng.annotations.Test;

import base.BasePage;
import page.HomePage;
import page.LoginPage;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver dv;
  @Test
  public void f() {
	  try {
		  HomePage hp = new HomePage(dv);
		  hp.click_nav_login();
		  
		  LoginPage lp = new LoginPage(dv);
		  lp.login("testmorning", "test123");
		  
		  System.out.print("This is the next function");
		  
	  }
	  catch(Exception E) {
		  System.out.print("This is just another");
	  }
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	  dv = new ChromeDriver();
	  BasePage bp = new BasePage(dv);
	  bp.startbrowser("https://demoblaze.com");
  }

  @AfterTest
  public void afterTest() {
	  dv.quit();
  }

}
