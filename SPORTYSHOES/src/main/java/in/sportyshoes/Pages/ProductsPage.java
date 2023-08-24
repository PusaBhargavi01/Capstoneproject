package in.sportyshoes.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
	private WebDriver driver;
	private JavascriptExecutor jsExecutor;
	Actions actions;
	
	
	//@FindBy(xpath = "(//a[contains(@class,'btn')])[1]")
	@FindBy(linkText = "Add to Cart")
	private WebElement addtocart;
	@FindBy(linkText = "Place Order")
	private WebElement placeorder;
	
	//@FindBy(xpath ="//div[contains(@class,'alert')]")
	@FindBy(linkText = "Home")
	private WebElement home;
	
	@FindBy(linkText = "Cart")
	private WebElement cart;
	
	
	public ProductsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver =driver;
		this.jsExecutor= (JavascriptExecutor)driver;
		
	}
	
	
	public void clickaddtocart() {
		JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;

		jsExecutor.executeScript("arguments[0].click();", addtocart); 
	}
	
	public void clickHome() {
		home.click();
		}
	public void clickcart() {
		cart.click();
		}
	
	public void clickplaceOrder() {
		JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;

		jsExecutor.executeScript("arguments[0].click();", placeorder); 
	}
	

}


