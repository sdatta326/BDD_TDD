package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;

public class testcase1 {
	WebDriver driver;
	@Given("^open chrome and start the application$")
	public void open_chrome_and_start_the_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("open chrome and browser open");
		

		System.setProperty("webdriver.chrome.driver","C:\\Eclipse Workspace\\chromedriver.exe");
        System.out.println("Steps for opening browser.....");
        driver = new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com");
	}

	@When("^the username and password is valid$")
	public void the_username_and_password_is_valid() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("username and password enter correct");
		 System.out.println("User is entering value for username and password");
	        driver.findElement(By.linkText("Log in")).click();
	        driver.findElement(By.name("Email")).sendKeys("cvenkata_raman@rediffmail.com");
	        driver.findElement(By.name("Password")).sendKeys("satyam123$");
	        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
	        driver.findElement(By.linkText("Log out")).click();

		
	}

	@Then("^the user is able to go to the HOME page$")
	public void the_user_is_able_to_go_to_the_HOME_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("user unable to go home");
		System.out.println("User reaches the HOME page");
        driver.close();
	}
	
}
