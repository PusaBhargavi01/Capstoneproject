package in.sportyshoes.Pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	@FindBy(linkText = "New User? Register Here")
	private WebElement register;
	
	@FindBy(id = "name")
	private WebElement name;
	
	@FindBy(id = "email")
	private WebElement email;
	
	@FindBy(id = "password")
	private WebElement password;
	
	
	@FindBy(xpath = "//button[contains(@class,'btn')]")
	private WebElement RegisterBtn;
	
	@FindBy(linkText = "Logout")
	private WebElement logout;
	
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void clickRegister() {
		register.click();
	}
	
	public void enterName(String Name) {
		name.sendKeys(Name);
	}
	
	public void enteremail(String EMail) {
		email.sendKeys(EMail);
	}
	public void enterPass(String pass) {
		password.sendKeys(pass);
	}
	
	public void clickregister() {
		RegisterBtn.click();
	}
	
	public void Logout() {
		logout.click();
	}

}


