package useCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class HormigaLoginCucumber {

	WebDriver driver;

	@Given("Acceder a l URL de l application HORMIGA")
	public void acceder_a_l_url_de_l_application_hormiga() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Farah\\eclipse-workspace\\HormigaTest\\src\\test\\ressources\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		// Implicity wait (for whole project)
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.navigate().to("https://preprod.hormiga.app/#/login");
	}

	@When("Saisir le username")
	public void saisir_le_username() {
		WebElement username;
		username = driver.findElement(By.name("username"));
		username.sendKeys("admin");
	}

	@And("Saisir le password")
	public void saisir_le_password() {
		WebElement password;
		password = driver.findElement(By.name("password"));
		password.sendKeys("123456");
	}

	@And("Cliquer sur Remember ME")
	public void cliquer_sur_remember_me() {
		WebElement rememberMe = driver.findElement(By.name("rememberme"));
		rememberMe.click();
	}

	@And("Cliquer sur le bouton SIGN IN")
	public void cliquer_sur_le_bouton_sign_in() {
		WebElement SignIn ;
		SignIn = driver.findElement(By.xpath("/html/body/dhm-root/app-login/div/div/div[2]/div/form/div[3]/div[2]/button"));
		SignIn.click();

	}

	@Then("Ouverture de la page d accueil")
	public void ouverture_de_la_page_d_accueil() {
		WebElement profilAdmin;
		profilAdmin = driver.findElement(By.xpath("/html/body/dhm-root/app-layout/div/div[1]/app-starter-header/div/nav/ul[2]/li/a/div/span"));
		String message;
		message = profilAdmin.getText();
		System.out.println(message);
		Assert.assertEquals("admin", message);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
