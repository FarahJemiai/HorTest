package useCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class HormigaCreateCraAsAdmin {
	WebDriver driver;

	@Given("URL HORMIGA")
	public void url_hormiga() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Farah\\eclipse-workspace\\HormigaTest\\src\\test\\ressources\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		// Implicity wait (for whole project)
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.navigate().to("https://preprod.hormiga.app/#/login");
	}

	@When("Saisir login")
	public void saisir_login() {
		WebElement username;
		username = driver.findElement(By.name("username"));
		username.sendKeys("admin");
	}

	@And("Saisir PW")
	public void saisir_pw() {
		WebElement password;
		password = driver.findElement(By.name("password"));
		password.sendKeys("123456");
	}

	@And("Remember Me")
	public void remember_me() {
		WebElement rememberMe = driver.findElement(By.name("rememberme"));
		rememberMe.click();
	}

	@And("Se connecter")
	public void se_connecter() {
		WebElement SignIn;
		SignIn = driver
				.findElement(By.xpath("/html/body/dhm-root/app-login/div/div/div[2]/div/form/div[3]/div[2]/button"));
		SignIn.click();
	}

	@And("Cliquer sur Activity")
	public void cliquer_sur_activity() {
		WebElement Activity;
		Activity = driver.findElement(By.xpath(
				"/html/body/dhm-root/app-layout/div/div[2]/div[1]/app-starter-sidebar/div/aside/div/div[1]/nav/ul/li[2]"));
		Activity.click();
	}

	@And("Cliquer sur Timesheet")
	public void cliquer_sur_timesheet() {
		WebElement Timesheet;
		Timesheet = driver.findElement(By.xpath(
				"/html/body/dhm-root/app-layout/div/div[2]/div[1]/app-starter-sidebar/div/aside/div/div[1]/nav/ul/li[2]/ul/li[1]/a"));
		Timesheet.click();
	}

	@And("Cliquer sur Create CRA")
	public void cliquer_sur_create_cra() {
		WebElement CRA;
		CRA = driver.findElement(By.xpath("//*[@id=\"current_month-panel\"]/section/div[1]/button"));
		CRA.click();
	}

	@And("Selectionner developer list")
	public void selectionner_developer_list() {
		WebElement listeDev;
		listeDev = driver.findElement(By.id("a847d7a74eb5"));
		Select sel1 = new Select(listeDev);
		sel1.selectByVisibleText("webb devv");
	}

	@And("Selectionner project list")
	public void selectionner_project_list() {
		WebElement listeProject;
		listeProject = driver.findElement(By.xpath("//*[@id=\"project\"]/div/div/div[2]/input"));
		Select sel2 = new Select(listeProject);
		sel2.selectByVisibleText("Project La Postee");
	}

	@And("Calendrier")
	public void Calendrier() {
		WebElement calendrier;
		calendrier = driver.findElement(By.xpath("//*[@id=\"calendar\"]/div/div/div[1]/button[3]"));
		calendrier.click();
	}

	@And("Cliquer Next1")
	public void cliquer_next1() {
		WebElement btnNext1;
		btnNext1 = driver.findElement(
				By.xpath("/html/body/ngb-modal-window/div/div/app-worksheet-create/div[2]/div[2]/div[6]/button"));
		btnNext1.click();

	}

	@And("Cliquer Next2")
	public void cliquer_next2() {
		WebElement btnNext2;
		btnNext2 = driver.findElement(By.xpath(
				"/html/body/ngb-modal-window/div/div/app-worksheet-create/div[2]/div[2]/app-worksheet-wizard/aw-wizard/div/aw-wizard-step[1]/div[3]/button[2]"));
		btnNext2.click();

	}

	@And("Cliquer Next3")
	public void cliquer_next3() {
		WebElement btnNext3;
		btnNext3 = driver.findElement(By.xpath(
				"/html/body/ngb-modal-window/div/div/app-worksheet-create/div[2]/div[2]/app-worksheet-wizard/aw-wizard/div/aw-wizard-step[2]/div[3]/button[2]"));
		btnNext3.click();

	}

	@And("Cliquer Next4")
	public void cliquer_next4() {
		WebElement btnNext1;
		btnNext1 = driver.findElement(By.xpath(
				"/html/body/ngb-modal-window/div/div/app-worksheet-create/div[2]/div[2]/app-worksheet-wizard/aw-wizard/div/aw-wizard-step[2]/div[3]/button[2]"));
		btnNext1.click();

	}

	@And("Cliquer Next5")
	public void cliquer_next5() {
		WebElement btnNext5;
		btnNext5 = driver.findElement(By.xpath(
				"/html/body/ngb-modal-window/div/div/app-worksheet-create/div[2]/div[2]/app-worksheet-wizard/aw-wizard/div/aw-wizard-step[4]/div[3]/button[2]"));
		btnNext5.click();

	}

	public void cliquer_next6() {
		WebElement btnNext6;
		btnNext6 = driver.findElement(By.xpath(
				"/html/body/ngb-modal-window/div/div/app-worksheet-create/div[2]/div[2]/app-worksheet-wizard/aw-wizard/div/aw-wizard-step[4]/div[3]/button[2]"));
		btnNext6.click();

	}

	@And("Cliquer Save")
	public void cliquer_save() {
		WebElement save1;
		save1 = driver.findElement(By.xpath(
				"/html/body/ngb-modal-window/div/div/app-worksheet-create/div[2]/div[2]/app-worksheet-wizard/aw-wizard/div/aw-wizard-step[5]/div[3]/button[2]"));
		save1.click();
	}

	@And("Confirmer Save")
	public void confirmer_save() {
		WebElement ConfSave;
		ConfSave = driver.findElement(By.xpath("/html/body/div/div/div[3]/button[1]"));
		ConfSave.click();
	}

	@Then("Creation CRA valide")
	public void creation_cra_valide() {
		WebElement ConfirmationCRA;
		ConfirmationCRA = driver.findElement(By.id("swal2-content"));
		String message;
		message = ConfirmationCRA.getText();
		System.out.println(message);
		Assert.assertEquals("Successfully ", message);
	}

}
