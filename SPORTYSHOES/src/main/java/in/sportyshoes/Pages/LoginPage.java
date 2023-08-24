package in.sportyshoes.Pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id = "email")
	private WebElement email;
	
	@FindBy(id = "password")
	private WebElement password;	
	@FindBy(xpath = "//button[contains(@class,'btn')]")
	private WebElement LoginBtn;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void enteremail(String EMail) {
		email.sendKeys(EMail);
	}
	public void enterPass(String pass) {
		password.sendKeys(pass);
	}
	
	public void clicklogin() {
		
		LoginBtn.click();
	}



}
