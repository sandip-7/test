package base;

import org.openqa.selenium.By;

public class Locators {
	
	public Locators() {
		
		By txt_username = By.id("loginusername");
		By navLogin = By.id("login2");
		By txt_passsword = By.id("loginpassword");
		By loginButton = By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]");
	}
	
	

}
