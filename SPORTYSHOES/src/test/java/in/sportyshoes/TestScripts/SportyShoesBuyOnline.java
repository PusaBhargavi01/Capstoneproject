package in.sportyshoes.TestScripts;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import in.sportyshoes.Pages.LoginPage;
import in.sportyshoes.Pages.ProductsPage;
import in.sportyshoes.Pages.RegisterPage;

public class SportyShoesBuyOnline {
	public static void main(String[] args) throws InterruptedException{	
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:9010/");
	
	RegisterPage registerPage = new RegisterPage(driver);
	LoginPage loginPage = new LoginPage(driver);
	ProductsPage productsPage = new ProductsPage(driver);
	registerPage.clickRegister();
	registerPage.enterName("Bhargavi");
	registerPage.enteremail("abcde@gmail.com");
	registerPage.enterPass("Bhar@01");
	registerPage.clickregister();
	registerPage.Logout();
	loginPage.enteremail("abcde@gmail.com");
	loginPage.enterPass("Bhar@01");
	loginPage.clicklogin();
	productsPage.clickaddtocart();
	productsPage.clickHome();
	productsPage.clickcart();
	Thread.sleep(3000);
	
	productsPage.clickplaceOrder();
	}

}


