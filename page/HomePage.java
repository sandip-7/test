package page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	By navLogin = By.id("login2");
	
	public void click_nav_login() {
		
		driver.findElement(navLogin).click();
	}
	
	
	

}
