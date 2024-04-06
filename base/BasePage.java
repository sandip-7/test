package base;

import org.openqa.selenium.WebDriver;

public class BasePage {
	WebDriver driver;
	
	public BasePage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	public void maximize_window() {
		
		driver.manage().window().maximize();
	}
	
	public void getURL(String url) {
		
		driver.get(url);
	}
	
	public void startbrowser(String url) {
		
		maximize_window();
		getURL(url);
	}
}
